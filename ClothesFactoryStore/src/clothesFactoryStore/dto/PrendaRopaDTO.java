package clothesFactoryStore.dto;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase PrendaRopaDTO
 *
 * Contiene información de las prendas de ropa.
 *
 * @author AndresHernandez
 * @version 1.0
 */

public class PrendaRopaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;

	private int costoSinEnvio;
	private int costoConEnvio;
	private int idTipo;

	private Boolean existenciasEnInventario;
	private String nombre;
	private ArrayList<String> tallasDisponibles ;
	private ArrayList<String> coloresDisponiles ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCostoSinEnvio() {
		return costoSinEnvio;
	}
	public void setCostoSinEnvio(int costoSinEnvio) {
		this.costoSinEnvio = costoSinEnvio;
	}
	public int getCostoConEnvio() {
		return costoConEnvio;
	}
	public void setCostoConEnvio(int costoConEnvio) {
		this.costoConEnvio = costoConEnvio;
	}
	public Boolean getExistenciasEnInventario() {
		return existenciasEnInventario;
	}
	public void setExistenciasEnInventario(Boolean existenciasEnInventario) {
		this.existenciasEnInventario = existenciasEnInventario;
	}
	public ArrayList<String> getTallasDisponibles() {
		return tallasDisponibles;
	}
	public void setTallasDisponibles(ArrayList<String> tallasDisponibles) {
		this.tallasDisponibles = tallasDisponibles;
	}
	public ArrayList<String> getColoresDisponiles() {
		return coloresDisponiles;
	}
	public void setColoresDisponiles(ArrayList<String> coloresDisponiles) {
		this.coloresDisponiles = coloresDisponiles;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

}
