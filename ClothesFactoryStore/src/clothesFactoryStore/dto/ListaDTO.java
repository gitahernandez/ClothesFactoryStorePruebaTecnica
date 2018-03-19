package clothesFactoryStore.dto;
import java.io.Serializable;
import java.util.ArrayList;
/**
 * Clase ListaDTO
 *
 * Contiene un arreglo de tipo ItemListaDTO, para listar objetos, opciones.
 *
 * @author AndresHernandez
 * @version 1.0
 */

public class ListaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	ArrayList<ItemListaDTO> listaItemListaDTO ;
	private String nombreLista;
	
	public ArrayList<ItemListaDTO> getListaItemListaDTO() {
		return listaItemListaDTO;
	}
	public void setListaItemListaDTO(ArrayList<ItemListaDTO> listaItemListaDTO) {
		this.listaItemListaDTO = listaItemListaDTO;
	}
	public String getNombreLista() {
		return nombreLista;
	}
	public void setNombreLista(String nombreLista) {
		this.nombreLista = nombreLista;
	}
	
	
}
