clothesFactoryStoreApp.factory('clothesFactoryStoreService', function ($http, $q){
       

        // Obtener los precios del envío por ciudad.
        function getCiudadesEnvio(server) {
            var deferred = $q.defer();
            var req = {
                method: 'GET',
                url:  server+"/ClothesFactoryStore/RestWs/Pedidos/getCiudadesEnvio",
                data: '',
                headers: {'Content-Type': 'application/json'}
            };
            $http(req)
                .success(function (data) {
                    deferred.resolve(data)
                })
                .error(function (error, status){
                    var obj = [
                                    {
                                        "codigo": 1,
                                        "costoEnvio": 35000,
                                        "nombre": "Bogotá"
                                    },
                                    {
                                        "codigo": 2,
                                        "costoEnvio": 45000,
                                        "nombre": "Mosquera"
                                    },
                                    {
                                        "codigo": 3,
                                        "costoEnvio": 50000,
                                        "nombre": "Chia"
                                    },
                                    {
                                        "codigo": 4,
                                        "costoEnvio": 12000,
                                        "nombre": "Tunja"
                                    }
                                ]
                    obj.codigo = 1;
                    deferred.resolve(obj);
                }); 
            
            return deferred.promise;
        };

        // Obtener las prendas disponibles para la venta.
        function getPrendasVenta(server) {
            var deferred = $q.defer();
            var req = {
                method: 'GET',
                url:  server+"/ClothesFactoryStore/RestWs/Pedidos/getPrendasVenta",
                data: '',
                headers: {'Content-Type': 'application/json'}
            };
            $http(req)
                .success(function (data) {
                    deferred.resolve(data)
                })
                .error(function (error, status){
                    var obj = [
                                    {
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
                                        ],
                                        "costoConEnvio": 0,
                                        "costoSinEnvio": 40000,
                                        "existenciasEnInventario": true,
                                        "id": 1,
                                        "idTipo": 1,
                                        "nombre": "CAMISA MANGA LARGA",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ]
                                    },
                                    {
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
                                        ],
                                        "costoConEnvio": 0,
                                        "costoSinEnvio": 55000,
                                        "existenciasEnInventario": true,
                                        "id": 2,
                                        "idTipo": 2,
                                        "nombre": "PANTALON CORTO",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ]
                                    },
                                    {
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
                                        ],
                                        "costoConEnvio": 0,
                                        "costoSinEnvio": 100000,
                                        "existenciasEnInventario": true,
                                        "id": 3,
                                        "idTipo": 3,
                                        "nombre": "CHAQUETA",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ]
                                    },
                                     {
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
                                        ],
                                        "costoConEnvio": 0,
                                        "costoSinEnvio": 100000,
                                        "existenciasEnInventario": true,
                                        "id": 4,
                                        "idTipo": 3,
                                        "nombre": "CHAQUETA",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ]
                                    },
                                     {
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
                                        ],
                                        "costoConEnvio": 0,
                                        "costoSinEnvio": 100000,
                                        "existenciasEnInventario": true,
                                        "id": 5,
                                        "idTipo": 3,
                                        "nombre": "CHAQUETA",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ]
                                    },
                                    {
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
                                        ],
                                        "costoConEnvio": 0,
                                        "costoSinEnvio": 100000,
                                        "existenciasEnInventario": true,
                                        "id": 6,
                                        "idTipo": 3,
                                        "nombre": "CHAQUETA",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ]
                                    }
                                ];
                                                    
                    deferred.resolve(obj);
                }); 
            
            return deferred.promise;
        };


           // Obtener los tipos de prendas disponibles para la venta.
        function getTiposPrenda(server) {
            var deferred = $q.defer();
            var req = {
                method: 'GET',
                url:  server+"/ClothesFactoryStore/RestWs/Pedidos/getTiposPrenda",
                data: '',
                headers: {'Content-Type': 'application/json'}
            };
            $http(req)
                .success(function (data) {
                    deferred.resolve(data)
                })
                .error(function (error, status){
                    var obj = {
                                "listaItemListaDTO": [
                                    {
                                        "codigo": "1",
                                        "estado": true,
                                        "labelMostrar": "Camisas Formales",
                                        "nombre": "Camisas Formales"
                                    },
                                    {
                                        "codigo": "2",
                                        "estado": true,
                                        "labelMostrar": "Pantalones formales",
                                        "nombre": "Pantalones formales"
                                    },
                                    {
                                        "codigo": "3",
                                        "estado": true,
                                        "labelMostrar": "Chaquetas",
                                        "nombre": "Chaquetas"
                                    }
                                ],
                                "nombreLista": "tiposPrenda"
                            }
        
                    deferred.resolve(obj);
                }); 
            
            return deferred.promise;
        };


        // Envía al Backend el pedido realizado por el cliente.
        function setPedido(server,pedidoDTO) {
            var deferred = $q.defer();
            var req = {
                method: 'POST',
                url:  server+"/ClothesFactoryStore/RestWs/Pedidos/setPedido",
                data: pedidoDTO,
                headers: {'Content-Type': 'application/json'}
            };
            $http(req)
                .success(function (data) {
                    deferred.resolve(data)
                })
                .error(function (error, status){
                    var obj = {};
                    obj.codigo = 1;
                    deferred.resolve(obj);
                }); 
            
            return deferred.promise;
        };
        

        return {
            getCiudadesEnvio: getCiudadesEnvio,
            getPrendasVenta:getPrendasVenta,
            getTiposPrenda:getTiposPrenda,
            setPedido,setPedido


        };
    
    });