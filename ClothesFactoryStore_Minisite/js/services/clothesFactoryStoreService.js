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
                                        "id": 1,
                                        "costoSinEnvio": 30000,
                                        "costoConEnvio": 0,
                                        "idTipo": 1,
                                        "existenciasEnInventario": true,
                                        "nombre": "CAMISA MANGA LARGA SLIM",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ],
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
                                        ]
                                    },
                                    {
                                        "id": 2,
                                        "costoSinEnvio": 45000,
                                        "costoConEnvio": 0,
                                        "idTipo": 1,
                                        "existenciasEnInventario": true,
                                        "nombre": "CAMISA MANGA CORTA",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ],
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
                                        ]
                                    },
                                    {
                                        "id": 3,
                                        "costoSinEnvio": 120000,
                                        "costoConEnvio": 0,
                                        "idTipo": 2,
                                        "existenciasEnInventario": true,
                                        "nombre": "PANTALON ELEGANTE",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ],
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
                                        ]
                                    },
                                    {
                                        "id": 4,
                                        "costoSinEnvio": 70000,
                                        "costoConEnvio": 0,
                                        "idTipo": 2,
                                        "existenciasEnInventario": true,
                                        "nombre": "PANTALON POCO FORMAL",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ],
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
                                        ]
                                    },
                                    {
                                        "id": 5,
                                        "costoSinEnvio": 250000,
                                        "costoConEnvio": 0,
                                        "idTipo": 3,
                                        "existenciasEnInventario": true,
                                        "nombre": "CHAQUETA EN CUERO",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ],
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
                                        ]
                                    },
                                    {
                                        "id": 6,
                                        "costoSinEnvio": 356000,
                                        "costoConEnvio": 0,
                                        "idTipo": 3,
                                        "existenciasEnInventario": true,
                                        "nombre": "CHAQUETA DE INVIERNO",
                                        "tallasDisponibles": [
                                            "S",
                                            "M",
                                            "L"
                                        ],
                                        "coloresDisponiles": [
                                            "AZUL",
                                            "ROJO",
                                            "VERDE"
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