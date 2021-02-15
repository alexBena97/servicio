package est.ups.edu.negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import est.ups.edu.ec.datos.InformacionDAO;
import est.ups.edu.ec.modelo.Informacion;

@Stateless
public class InformacionON implements InformacionONLocal{
	
	@Inject 
	private InformacionDAO informacionDAO; 
	
	public String guardarInformacion (Informacion in) { 
		try { 
			informacionDAO.insert(in); 
			return "Guardado Correcto";
		}catch (Exception e) {
			informacionDAO.insert(in); 
			return "El error es el siguiente : "+e.getMessage();
		}
	}
}
