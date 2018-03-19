package clothesFactoryStore.dto;
import java.io.Serializable;
/**
 * Clase RespuestaDTO
 *
 * Contiene información de la respuesta de la transacción(pedido) , es la respuesta al Front End.
 *
 * @author AndresHernandez
 * @version 1.0
 */

public class RespuestaPedidoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String mensajeMostrar;
	private int codigoTransaccion ; 

	
	public String getMensaje() {
		return mensajeMostrar;
	}
	public void setMensaje(String mensaje) {
		this.mensajeMostrar = mensaje;
	}
	public  int getCodigoTransaccion() {
		return codigoTransaccion;
	}
	public void setCodigoTransaccion(int codigoTransaccion) {
		this.codigoTransaccion = codigoTransaccion;
	}
	
}
