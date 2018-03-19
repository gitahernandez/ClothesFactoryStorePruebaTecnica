package clothesFactoryStore.Rest;

import java.util.ArrayList;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import clothesFactoryStore.dto.CiudadesEnvioDTO;
import clothesFactoryStore.dto.ListaDTO;
import clothesFactoryStore.dto.PedidoDTO;
import clothesFactoryStore.dto.PrendaRopaDTO;
import clothesFactoryStore.dto.RespuestaPedidoDTO;
import clothesFactoryStore.transaction.ClothesFactoryStoreFacadeBean;


/**
 * Clase ClothesFactoryStoreWebServices
 *
 * Exposición de WebServices
 * 
 *
 * @author AndresHernandez
 * @version 1.0
 */
@ApplicationPath("resources")
@Path("/Pedidos")
public class ClothesFactoryStoreWebServices {
	private static Logger log = Logger.getLogger(ClothesFactoryStoreWebServices.class);
	ClothesFactoryStoreFacadeBean clothesFactoryStoreFacadeBean =  new ClothesFactoryStoreFacadeBean();
	
	
	@Path("/getTiposPrenda")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ListaDTO getTiposPrenda() {
	
		
		
		ListaDTO listaDTO = new ListaDTO();
		try {
	
			listaDTO = clothesFactoryStoreFacadeBean.getTiposPrenda();

		}
		catch (Exception e) {
			log.error("Error obteniendo los costos de envio : "+e);
		}
		return listaDTO;
	}
	
	@Path("/setPedido")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaPedidoDTO setPedido(PedidoDTO pedidoDto) {
		RespuestaPedidoDTO respuestaPedidoDTO = new RespuestaPedidoDTO();
		try {
			
			respuestaPedidoDTO = clothesFactoryStoreFacadeBean.setPedido(pedidoDto);
		}
		catch (Exception e) {
			log.error("Error registrando el pedido : "+e);
			respuestaPedidoDTO.setCodigoTransaccion(1);
			respuestaPedidoDTO.setMensaje("Error registrando el pedido");
		}
	
		return respuestaPedidoDTO;
		
	}
	
	
	@Path("/getPrendasVenta")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PrendaRopaDTO> getPrendasVenta() {
		ArrayList<PrendaRopaDTO> listPrendaRopaDTO = new ArrayList<PrendaRopaDTO>();
		try {
			listPrendaRopaDTO = clothesFactoryStoreFacadeBean.getPrendasVenta();
		}
		catch (Exception e) {
			log.error("Error obteniendo la información de las prendas : "+e);
		}
		return listPrendaRopaDTO;	
	}
	
	@Path("/getCiudadesEnvio")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<CiudadesEnvioDTO> getCiudadesEnvio() {
		ArrayList<CiudadesEnvioDTO> listaciudadesEnvioDTO = new ArrayList<CiudadesEnvioDTO>() ;
		try {
			listaciudadesEnvioDTO = clothesFactoryStoreFacadeBean.getCiudadesEnvio();
		}
		catch (Exception e) {
			log.error("Error obteniendo la información de las prendas : "+e);
		}
		return listaciudadesEnvioDTO;	
	}
}
