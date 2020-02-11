package ttps.spring.clasesDAO;
import ttps.spring.interfacesDAO.OwnerDAOInterface;
import ttps.spring.model.Owner;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class OwnerDAO extends GenericDao<Owner> implements OwnerDAOInterface {
	

	public OwnerDAO() {
		super(Owner.class);
	}
	 @Override
	 public Owner recuperarOwner(Long i) {
		 Query consulta = EMF.getEMF().createEntityManager().createQuery("select o from Owner o where o.owner_id =?1");
		 consulta.setParameter(1, i);
		 Owner resultado = (Owner)consulta.getSingleResult();
		 return resultado;
		 }
}