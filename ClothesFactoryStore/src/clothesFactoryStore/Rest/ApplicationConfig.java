package clothesFactoryStore.Rest;

import java.util.Set;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

/**
 * Clase ApplicationConfig
 *
 * Facade: Configuración del Path de los servicios REST.
 *
 * @author AndresHernandez
 * @version 1.0
 */
@ApplicationPath("RestWs")
public class ApplicationConfig extends Application {

	public Set<Class<?>> getClasses() {
        return getRestClasses();
    }
    
	//Auto-generated from RESTful web service wizard
    private Set<Class<?>> getRestClasses() {
		Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
		
		resources.add(clothesFactoryStore.Rest.ClothesFactoryStoreWebServices.class);
		return resources;    
    }
}