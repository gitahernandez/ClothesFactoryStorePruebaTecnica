package clothesFactoryStore.dto;

import java.io.Serializable;

/**
 * Clase ItemPedidoDTO
 *
 * Contiene información de una prenda del pedido realizado por un cliente.
 *
 * @author AndresHernandez
 * @version 1.0
 */

public class ItemPedidoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idPrendaDTO;
	private String nombrePrendaDTO;
	private int cantidad;
	private String color;
	private String talla;
	private int costoSinEnvio;
	public int getIdPrendaDTO() {
		return idPrendaDTO;
	}
	public void setIdPrendaDTO(int idPrendaDTO) {
		this.idPrendaDTO = idPrendaDTO;
	}
	public String getNombrePrendaDTO() {
		return nombrePrendaDTO;
	}
	public void setNombrePrendaDTO(String nombrePrendaDTO) {
		this.nombrePrendaDTO = nombrePrendaDTO;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	public int getCostoSinEnvio() {
		return costoSinEnvio;
	}
	public void setCostoSinEnvio(int costoSinEnvio) {
		this.costoSinEnvio = costoSinEnvio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

	

}
