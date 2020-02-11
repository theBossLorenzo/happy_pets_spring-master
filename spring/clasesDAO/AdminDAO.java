package ttps.spring.clasesDAO;
import org.springframework.stereotype.Repository;
import ttps.spring.interfacesDAO.AdminDAOInterface;
import ttps.spring.model.Admin;

import javax.persistence.Query;

@Repository
public class AdminDAO extends GenericDao<Admin> implements AdminDAOInterface {

	

	public AdminDAO() {
		super(Admin.class);
	}
	 @Override
	 public Admin recuperarAdmin(Long i) {
		 Query consulta = EMF.getEMF().createEntityManager().createQuery("select a from Admin a where a.admin_id =?1");
		 consulta.setParameter(1, i);
		 Admin resultado = (Admin)consulta.getSingleResult();
		 return resultado;
		 }
}