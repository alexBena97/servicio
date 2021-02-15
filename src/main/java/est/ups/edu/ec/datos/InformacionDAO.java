package est.ups.edu.ec.datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import est.ups.edu.ec.modelo.Informacion;

@Stateless
public class InformacionDAO {
	
	@PersistenceContext
	private EntityManager em; 
	
	public void insert(Informacion f) {
		em.persist(f);
	}	
}
