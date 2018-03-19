package clothesFactoryStore.transaction;

import java.util.ArrayList;
import com.google.gson.Gson;

import clothesFactoryStore.dto.CiudadesEnvioDTO;
import clothesFactoryStore.dto.ItemListaDTO;
import clothesFactoryStore.dto.ListaDTO;
import clothesFactoryStore.dto.PedidoDTO;
import clothesFactoryStore.dto.PrendaRopaDTO;
import clothesFactoryStore.dto.RespuestaPedidoDTO;


/**
 * Clase ClothesFactoryStoreServiceBean
 *
 * Facade: Recibe la información del facade, retorna información guarda informacion
 * si hubiese base datos esta capa seria la encargada de intereactuar con ella.
 *
 * @author AndresHernandez
 * @version 1.0
 */
public class ClothesFactoryStoreServiceBean {

	public ArrayList<PrendaRopaDTO> getPrendasVenta() {
		ArrayList<PrendaRopaDTO> listPrendaRopaDTO=  new ArrayList<PrendaRopaDTO>();
		ArrayList<String> tallas = new ArrayList<String>();
		ArrayList<String> colores = new ArrayList<String>();
		
		PrendaRopaDTO prendaRopaDTO =  new PrendaRopaDTO();
		prendaRopaDTO.setId(1);
		prendaRopaDTO.setCostoSinEnvio(40000);
		prendaRopaDTO.setExistenciasEnInventario(true);
		prendaRopaDTO.setNombre("CAMISA MANGA LARGA");
		prendaRopaDTO.setIdTipo(1);
		tallas.add("S");
		tallas.add("M");
		tallas.add("L");
		colores.add("AZUL");
		colores.add("ROJO");
		colores.add("VERDE");
		prendaRopaDTO.setTallasDisponibles(tallas);
		prendaRopaDTO.setColoresDisponiles(colores);
		listPrendaRopaDTO.add(prendaRopaDTO);
		
		prendaRopaDTO =  new PrendaRopaDTO();
		tallas = new ArrayList<String>();
		colores = new ArrayList<String>();
		prendaRopaDTO.setId(2);
		prendaRopaDTO.setCostoSinEnvio(55000);
		prendaRopaDTO.setExistenciasEnInventario(true);
		prendaRopaDTO.setNombre("PANTALON CORTO");
		prendaRopaDTO.setIdTipo(2);
		tallas.add("S");
		tallas.add("M");
		tallas.add("L");
		colores.add("AZUL");
		colores.add("ROJO");
		colores.add("VERDE");
		prendaRopaDTO.setTallasDisponibles(tallas);
		prendaRopaDTO.setColoresDisponiles(colores);
		listPrendaRopaDTO.add(prendaRopaDTO);
	
		
		prendaRopaDTO =  new PrendaRopaDTO();
		tallas = new ArrayList<String>();
		colores = new ArrayList<String>();
		prendaRopaDTO.setId(3);
		prendaRopaDTO.setCostoSinEnvio(100000);
		prendaRopaDTO.setExistenciasEnInventario(true);
		prendaRopaDTO.setNombre("CHAQUETA");
		prendaRopaDTO.setIdTipo(3);
		tallas.add("S");
		tallas.add("M");
		tallas.add("L");
		colores.add("AZUL");
		colores.add("ROJO");
		colores.add("VERDE");
		prendaRopaDTO.setTallasDisponibles(tallas);
		prendaRopaDTO.setColoresDisponiles(colores);
		listPrendaRopaDTO.add(prendaRopaDTO);
		
		
		return listPrendaRopaDTO;
	}
	
	
	public RespuestaPedidoDTO setPedido(PedidoDTO pedidoDto) {
		Gson gson = new Gson();
		RespuestaPedidoDTO respuestaPedidoDTO= new  RespuestaPedidoDTO();
		System.out.println("Se registró la siguiente información para el pedido: ");
		System.out.println(gson.toJson(pedidoDto));
		respuestaPedidoDTO.setCodigoTransaccion(0);
		respuestaPedidoDTO.setMensaje("Pedido Registrado Exitosamente");
		return respuestaPedidoDTO;
	}
	
	public ListaDTO getTiposPrenda() {
		ListaDTO listaDTO = new ListaDTO();
		listaDTO.setNombreLista("tiposPrenda");
		ItemListaDTO itemListaDTO = new ItemListaDTO();
		
		ArrayList<ItemListaDTO> listaItemListaDTO = new ArrayList<ItemListaDTO>() ;
		
		itemListaDTO.setCodigo("1");
		itemListaDTO.setEstado(true);
		itemListaDTO.setLabelMostrar("Camisas Formales");
		itemListaDTO.setNombre("Camisas Formales");
		listaItemListaDTO.add(itemListaDTO);
		
		itemListaDTO = new ItemListaDTO();
		
		itemListaDTO.setCodigo("2");
		itemListaDTO.setEstado(true);
		itemListaDTO.setLabelMostrar("Pantalones formales");
		itemListaDTO.setNombre("Pantalones formales");
		listaItemListaDTO.add(itemListaDTO);
		
	itemListaDTO = new ItemListaDTO();
		
		itemListaDTO.setCodigo("3");
		itemListaDTO.setEstado(true);
		itemListaDTO.setLabelMostrar("Chaquetas");
		itemListaDTO.setNombre("Chaquetas");
		listaItemListaDTO.add(itemListaDTO);
		
		listaDTO.setListaItemListaDTO(listaItemListaDTO);
		return listaDTO;
	}
	
	
	public ArrayList<CiudadesEnvioDTO> getCiudadesEnvio() {
		ArrayList<CiudadesEnvioDTO> listaciudadesEnvioDTO = new ArrayList<CiudadesEnvioDTO>() ;
		
		CiudadesEnvioDTO ciudadesEnvioDTO =  new CiudadesEnvioDTO();
		ciudadesEnvioDTO.setCodigo(1);
		ciudadesEnvioDTO.setNombre("Bogotá");
		ciudadesEnvioDTO.setCostoEnvio(35000);
		listaciudadesEnvioDTO.add(ciudadesEnvioDTO);
		
		ciudadesEnvioDTO =  new CiudadesEnvioDTO();
		ciudadesEnvioDTO.setCodigo(2);
		ciudadesEnvioDTO.setNombre("Mosquera");
		ciudadesEnvioDTO.setCostoEnvio(45000);
		listaciudadesEnvioDTO.add(ciudadesEnvioDTO);
		
		ciudadesEnvioDTO =  new CiudadesEnvioDTO();
		ciudadesEnvioDTO.setCodigo(3);
		ciudadesEnvioDTO.setNombre("Chia");
		ciudadesEnvioDTO.setCostoEnvio(50000);
		listaciudadesEnvioDTO.add(ciudadesEnvioDTO);

		ciudadesEnvioDTO =  new CiudadesEnvioDTO();
		ciudadesEnvioDTO.setCodigo(4);
		ciudadesEnvioDTO.setCostoEnvio(12000);
		ciudadesEnvioDTO.setNombre("Tunja");
		listaciudadesEnvioDTO.add(ciudadesEnvioDTO);

		
		return listaciudadesEnvioDTO;
		
	}
}
