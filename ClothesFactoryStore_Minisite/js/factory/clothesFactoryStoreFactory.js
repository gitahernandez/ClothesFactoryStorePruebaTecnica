// Definición Factory
clothesFactoryStoreApp.factory('clothesFactoryStoreFactory', function ($http,clothesFactoryStoreService) {

    
    var ciudadesEnvio = [];
    var prendasVenta = [];
    var tiposPrenda = [];
    var pedido = [];


    function enviarPedido(pedido) {
     clothesFactoryStoreService.setPedido(url,pedido).then(function(data){
            var respuesta = data;

        });
        
    }


    var interfaz = {
        getCiudadesEnvio : function (url) {
        clothesFactoryStoreService.getCiudadesEnvio(url).then(function(data){
            ciudadesEnvio = data;
        });
        return ciudadesEnvio;
        },
        getPrendasVenta : function (url) {
            clothesFactoryStoreService.getPrendasVenta(url).then(function(data){
                    prendasVenta = data;
            
                });
        return prendasVenta;
        },
        getTiposPrenda : function (url) {
               clothesFactoryStoreService.getTiposPrenda(url).then(function(data){
                    tiposPrenda = data;
                });
           return tiposPrenda;
        },
        setPedido : function (pedidoCliente) {
           return pedido = pedidoCliente ;
        },
        obtenerDataInicial : function () {
            obtenerDataInicial();
        }
       
    };

    return interfaz;
});