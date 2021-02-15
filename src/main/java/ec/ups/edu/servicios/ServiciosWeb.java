package ec.ups.edu.servicios;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import est.ups.edu.ec.modelo.Informacion;
import est.ups.edu.negocio.InformacionONLocal; 

@Path("/servicios")
public class ServiciosWeb { 
	@Inject  
	private InformacionONLocal onLocal; 
	
	@POST
	@Path("/guardar")  
	@Produces("application/json;charset=utf-8")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	public String guardar(@FormParam("nombre")String nombre, 
						  @FormParam("apellido") String apellido,  
						  @FormParam("url") String url ,  
						  @FormParam("informacion") String descripcion) {
		Informacion informacion = new Informacion(); 
		informacion.setNombre(nombre); 
		informacion.setApellido(apellido); 
		informacion.setUrl(url); 
		informacion.setInformacion(descripcion);
		return onLocal.guardarInformacion(informacion); 
	}
	
	
	@GET
	@Path("/guardar2") 
	@Produces("application/json")  
	public String guardar2(@QueryParam("nombre") String nombre,@QueryParam("apellido") String apellido, @QueryParam("url") String url , @QueryParam("descripcion") String descripcion) {
		Informacion informacion = new Informacion(); 
		informacion.setNombre(nombre); 
		informacion.setApellido(apellido); 
		informacion.setUrl(url); 
		informacion.setInformacion(descripcion);
		return onLocal.guardarInformacion(informacion); 
		
	} 

}
