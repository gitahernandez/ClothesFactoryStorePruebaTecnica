/**
 * 
 */
package clothesFactoryStore.pruebasUnitarias;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clothesFactoryStore.Rest.ClothesFactoryStoreWebServices;
import clothesFactoryStore.dto.ItemPedidoDTO;
import clothesFactoryStore.dto.PedidoDTO;
import clothesFactoryStore.dto.RespuestaPedidoDTO;

/**
 * @author AndrésHernández
 *
 */
public class SetPedidoTest {

	@Test
	public void testRegistrarPedido() {
		PedidoDTO pedidoDto = new PedidoDTO();
		pedidoDto.setDocumento("1060733998");
		pedidoDto.setNombreCliente("Andrés Hernández");
		pedidoDto.setTipoDocumento("CC");
		pedidoDto.setDocumento("1069733998");
		ItemPedidoDTO itemPedidoDTO = new ItemPedidoDTO();

		itemPedidoDTO.setIdPrendaDTO(1);
		itemPedidoDTO.setCantidad(1);
		itemPedidoDTO.setColor("AZUL");
		itemPedidoDTO.setColor("M");
		ArrayList<ItemPedidoDTO> listaItemPedidoDTO = new ArrayList<ItemPedidoDTO>();
		listaItemPedidoDTO.add(itemPedidoDTO);
		
		pedidoDto.setListaItemPedidoDTO(listaItemPedidoDTO);
		
		ClothesFactoryStoreWebServices clothesFactoryStoreWebServices = new ClothesFactoryStoreWebServices();
		RespuestaPedidoDTO respuestaPedidoDTO = new RespuestaPedidoDTO();
		respuestaPedidoDTO = clothesFactoryStoreWebServices.setPedido(pedidoDto);
		// 0 quiere decir que la transaccion se ejecutó correctamente.
		assertEquals(respuestaPedidoDTO.getCodigoTransaccion(),0);
	}

}
