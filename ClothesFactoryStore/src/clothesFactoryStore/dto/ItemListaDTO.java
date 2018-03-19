package clothesFactoryStore.dto;
import java.io.Serializable;
/**
 * Clase ItemListaDTO
 *
 * Objeto de tipo item de lista, contiene información de un item.
 *
 * @author AndresHernandez
 * @version 1.0
 */

public class ItemListaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String nombre ; 
	private String labelMostrar;
	private Boolean estado;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLabelMostrar() {
		return labelMostrar;
	}
	public void setLabelMostrar(String labelMostrar) {
		this.labelMostrar = labelMostrar;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
}
