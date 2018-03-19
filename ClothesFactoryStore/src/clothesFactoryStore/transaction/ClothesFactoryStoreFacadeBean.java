package clothesFactoryStore.transaction;

import java.util.ArrayList;

import clothesFactoryStore.dto.CiudadesEnvioDTO;
import clothesFactoryStore.dto.ListaDTO;
import clothesFactoryStore.dto.PedidoDTO;
import clothesFactoryStore.dto.PrendaRopaDTO;
import clothesFactoryStore.dto.RespuestaPedidoDTO;

/**
 * Clase ClothesFactoryStoreFacadeBean
 *
 * Facade: Recibe la información del WS, Procesa y envia a service para la extracción de datos desde la fuente.
 *
 * @author AndresHernandez
 * @version 1.0
 */
public class ClothesFactoryStoreFacadeBean  {
	ClothesFactoryStoreServiceBean clothesFactoryStoreServiceBean = new ClothesFactoryStoreServiceBean();	
	public ArrayList<PrendaRopaDTO> getPrendasVenta() {
		return clothesFactoryStoreServiceBean.getPrendasVenta();
	}
	public RespuestaPedidoDTO setPedido(PedidoDTO pedidoDto) {
		return clothesFactoryStoreServiceBean.setPedido(pedidoDto);
	}
	public ListaDTO getTiposPrenda() {
		return clothesFactoryStoreServiceBean.getTiposPrenda();
	}
	public ArrayList<CiudadesEnvioDTO> getCiudadesEnvio() {
		return clothesFactoryStoreServiceBean.getCiudadesEnvio();
	}


}
