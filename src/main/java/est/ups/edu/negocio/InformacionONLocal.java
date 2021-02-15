package est.ups.edu.negocio;

import javax.ejb.Local;

import est.ups.edu.ec.modelo.Informacion;

@Local
public interface InformacionONLocal {
	
	public String guardarInformacion (Informacion in); 
	
}
