package ttps.spring.clasesDAO;

import ttps.spring.model.User;
import org.springframework.stereotype.Repository;
import ttps.spring.interfacesDAO.UserDAOInterface;
import ttps.spring.model.Vet;

import java.util.List;

@Repository
public class UserDAO extends GenericDao<User> implements UserDAOInterface {
	
	public UserDAO() {
        super(User.class);
	}


	@Override
	public boolean getUser(String mail, String password) {
		int vet = this.getEntityManager().createNativeQuery("select * from Vet where Vet.user_mail = ?1  and Vet.user_password = ?2 ").setParameter(1, mail).setParameter(2, password).getResultList().size();
		int owner = this.getEntityManager().createNativeQuery("select * from Owner where Owner.user_mail = ?1  and Owner.user_password = ?2 ").setParameter(1, mail).setParameter(2, password).getResultList().size(); 
		int admin = this.getEntityManager().createNativeQuery("select * from Admin where Admin.user_mail = ?1  and Admin.user_password = ?2 ").setParameter(1, mail).setParameter(2, password).getResultList().size();
		return vet == 1 || owner == 1 || admin == 1;
	}
	
	@Override
	public Object findUser(String mail, String password) {
		int vet = this.getEntityManager().createNativeQuery("select * from Vet where Vet.user_mail = ?1  and Vet.user_password = ?2 ").setParameter(1, mail).setParameter(2, password).getResultList().size();
		int owner = this.getEntityManager().createNativeQuery("select * from Owner where Owner.user_mail = ?1  and Owner.user_password = ?2 ").setParameter(1, mail).setParameter(2, password).getResultList().size(); 
		int admin = this.getEntityManager().createNativeQuery("select * from Admin where Admin.user_mail = ?1  and Admin.user_password = ?2 ").setParameter(1, mail).setParameter(2, password).getResultList().size();
		if (vet == 1) {
			return this.getEntityManager().createNativeQuery("select * from Vet where Vet.user_mail = ?1  and Vet.user_password = ?2 ").setParameter(1, mail).setParameter(2, password).getSingleResult();
		} else if (owner == 1) {
			return this.getEntityManager().createNativeQuery("select * from Owner where Owner.user_mail = ?1  and Owner.user_password = ?2 ").setParameter(1, mail).setParameter(2, password).getSingleResult();
		} else if (admin == 1) {
			return this.getEntityManager().createNativeQuery("select * from Admin where Admin.user_mail = ?1  and Admin.user_password = ?2 ").setParameter(1, mail).setParameter(2, password).getSingleResult();
		}
		return null;
		
	}


	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
}
