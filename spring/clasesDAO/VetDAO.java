package ttps.spring.clasesDAO;
import ttps.spring.interfacesDAO.VetDAOInterface;
import ttps.spring.model.Vet;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class VetDAO extends GenericDao<Vet> implements VetDAOInterface {
	

	public VetDAO() {
		super(Vet.class);
	}
	 
	@Override
	 public Vet recuperarVet(Long i) {
		 Query consulta = EMF.getEMF().createEntityManager().createQuery("select v from Vet v where v.vet_id =?1");
		 consulta.setParameter(1, i);
		 Vet resultado = (Vet)consulta.getSingleResult();
		 return resultado;
		 }
	
	
}