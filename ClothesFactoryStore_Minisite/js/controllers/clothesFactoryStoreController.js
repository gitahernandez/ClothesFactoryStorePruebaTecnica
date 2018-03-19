clothesFactoryStoreApp.controller('clothesFactoryStoreController', function($scope, $sce, $q, $http, clothesFactoryStoreFactory,clothesFactoryStoreService){

  $scope.ciudadesEnvio = [];
  $scope.prendasVenta = [];
  $scope.tiposPrenda = [];
  $scope.pedido = {};
  $scope.pedido.listaItemPedidoDTO = [];
  $scope.pedido.nombreCliente = "";
  $scope.pedido.documento = "";
  $scope.pedido.direccion = "";

  $scope.cantidades = ["1","2","3"];
  $scope.ciudadEnvio = "";

  $scope.listoEnviar = false;
  $scope.maximo5prendas = false;

  $scope.pedido.tipoDocumento = "CC";
  

 $scope.url  = "http://localhost:9089";

 $scope.cargar = function()
 {	

     clothesFactoryStoreService.getTiposPrenda($scope.url).then(function(data){
                    $scope.tiposPrenda = data;
                      clothesFactoryStoreService.getPrendasVenta($scope.url).then(function(data){
	                  		$scope.prendasVenta = data;
	                  		$scope.buscarCategorias();
	                  		   clothesFactoryStoreService.getCiudadesEnvio($scope.url).then(function(data){
	                  				$scope.ciudadesEnvio = data;


	         
                				});
                		});
                    
                });

   
}
$scope.cargar();

 $scope.buscarCategorias = function()
 {	
  	 angular.forEach($scope.prendasVenta, function(prenda, index) {
  	 	prenda.cantidad = "1";
  	 	angular.forEach($scope.tiposPrenda.listaItemListaDTO, function(tipoPrenda, index) {
  	 		if(prenda.idTipo == tipoPrenda.codigo){
  	 				prenda.tipoNombre = tipoPrenda.labelMostrar;
  	 		}
  	 	});
  	 })


}
$scope.calcularTotales =  function(){
	$scope.calcularCostoTotalSinEnvio();
	$scope.pedido.costoTotalConEnvio = $scope.pedido.costoTotalSinEnvio + $scope.ciudadEnvio;
	  angular.forEach($scope.ciudadesEnvio, function(ciudad, index) {
	  	if($scope.ciudadEnvio == ciudad.codigo){
	  			$scope.pedido.ciudadEnvioDTO = ciudad;
	  	}
	  });

	$scope.pedido.costoTotalConEnvio = $scope.pedido.costoTotalSinEnvio + $scope.pedido.ciudadEnvioDTO.costoEnvio;
	
	$scope.listoEnviar = true;
		
	
}

 $scope.agregarAlCarrito = function(prenda)
 {		
 	$scope.yaExiste=false;

 	 angular.forEach($scope.pedido.listaItemPedidoDTO, function(itemPedido, index) {
  	 	if(prenda.id == itemPedido.idPrendaDTO){
  	 			$scope.yaExiste=true;
  	 		
  	 	}
  	 	else {
  	 		$scope.yaExiste=false;
  	 	
  	 	}
  	 });
  	 
  	if($scope.yaExiste){
  		return false;
  	}

  	if($scope.pedido.listaItemPedidoDTO.length==5){
  			$scope.maximo5prendas = true;
  			return false;
  	}

 	$scope.itemPedido = {};

 	$scope.itemPedido.idPrendaDTO = prenda.id;
 	$scope.itemPedido.nombrePrendaDTO = prenda.nombre;
 	$scope.itemPedido.cantidad = prenda.cantidad;
 	$scope.itemPedido.color = prenda.color;
 	$scope.itemPedido.talla = prenda.talla;
 	$scope.itemPedido.costoSinEnvio = prenda.costoSinEnvio * $scope.itemPedido.cantidad  ;
  	$scope.pedido.listaItemPedidoDTO.push($scope.itemPedido);
  	$scope.calcularTotales();


  	 


}

$scope.calcularCostoTotalSinEnvio = function(){
	$scope.pedido.costoTotalSinEnvio = 0;
  	 angular.forEach($scope.pedido.listaItemPedidoDTO, function(itemPedido, index) {
  	 	$scope.pedido.costoTotalSinEnvio = $scope.pedido.costoTotalSinEnvio + ( itemPedido.costoSinEnvio * itemPedido.cantidad) ;
  	 	});
  	 
}


$scope.enviarPedido = function(){

 if($scope.pedido.nombreCliente.length  == 0 ||  $scope.pedido.documento.length == 0 || $scope.pedido.direccion.length == 0){
			$scope.errorFormulario = true;

}
else{
	$scope.errorFormulario = false;
	$scope.enviado = true;
}
 clothesFactoryStoreService.setPedido($scope.url,$scope.pedido).then(function(data){
                            console.log(data);
                            console.log("Respuesta sel derver "+$scope.pedido);
                        });

}



 $scope.eliminarItemdeCarrito = function(pedido){	

  	$scope.pedido.costoTotalSinEnvio = 0;
  	 angular.forEach($scope.pedido.listaItemPedidoDTO, function(itemPedido, index) {
  	 	if(pedido.idPrendaDTO == itemPedido.idPrendaDTO){
  	 			$scope.pedido.listaItemPedidoDTO.splice(index, 1);
  	 	}
  	 	});
  	 
	$scope.calcularTotales();

}


});
