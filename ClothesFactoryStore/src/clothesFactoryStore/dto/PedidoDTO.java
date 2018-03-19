package clothesFactoryStore.dto;
import java.io.Serializable;
import java.util.ArrayList;

import clothesFactoryStore.dto.CiudadesEnvioDTO;
/**
 * Clase PedidoDTO
 *
 * Contiene la información de un pedido realizado por el cliente.
 *
 * @author AndresHernandez
 * @version 1.0
 */

public class PedidoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	ArrayList<ItemPedidoDTO> listaItemPedidoDTO ;
	private String nombreCliente;
	private String documento;
	private String tipoDocumento;
	private String costoTotalConEnvio;
	private String costoTotalSinEnvio;
	private String direccion;
	private CiudadesEnvioDTO CiudadEnvioDTO;
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<ItemPedidoDTO> getListaItemPedidoDTO() {
		return listaItemPedidoDTO;
	}
	public String getCostoTotalConEnvio() {
		return costoTotalConEnvio;
	}
	public void setCostoTotalConEnvio(String costoTotalConEnvio) {
		this.costoTotalConEnvio = costoTotalConEnvio;
	}
	public String getCostoTotalSinEnvio() {
		return costoTotalSinEnvio;
	}
	public void setCostoTotalSinEnvio(String costoTotalSinEnvio) {
		this.costoTotalSinEnvio = costoTotalSinEnvio;
	}
	public void setListaItemPedidoDTO(ArrayList<ItemPedidoDTO> listaItemPedidoDTO) {
		this.listaItemPedidoDTO = listaItemPedidoDTO;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	} 
	
	public CiudadesEnvioDTO getCiudadEnvioDTO() {
		return CiudadEnvioDTO;
	}
	public void setCiudadEnvioDTO(CiudadesEnvioDTO ciudadEnvioDTO) {
		CiudadEnvioDTO = ciudadEnvioDTO;
	}

	
}
