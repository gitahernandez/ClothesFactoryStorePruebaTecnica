package clothesFactoryStore.dto; 
import java.io.Serializable;
/**
 * Clase CiudadesEnvioDTO
 *
 * contiene información de las ciudades y el costo del envío del pedido a la ciudad.
 *
 * @author AndresHernandez
 * @version 1.0
 */

public class CiudadesEnvioDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nombre ; 
	private int costoEnvio;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCostoEnvio() {
		return costoEnvio;
	}
	public void setCostoEnvio(int costoEnvio) {
		this.costoEnvio = costoEnvio;
	}
	
}
