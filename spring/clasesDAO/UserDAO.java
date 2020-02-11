package ttps.spring.clasesDAO;

import ttps.spring.model.Admin;
import ttps.spring.model.Owner;
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
	public Object updateVet(Vet vet) {
			this.getEntityManager().createNativeQuery("update Vet set user_name = ?1, user_phone = ?2, user_surname = ?3, address = ?4, clinicName = ?5 where user_mail = ?6 ").setParameter(1, vet.getName()).setParameter(2, vet.getPhone()).setParameter(3,vet.getSurname()).setParameter(4, vet.getAddress()).setParameter(5, vet.getClinicName()).setParameter(6, vet.getMail()).executeUpdate();
			return vet;
	}
	
	@Override
	public Object updateAdmin(Admin admin) {
			this.getEntityManager().createNativeQuery("update Admin set user_name = ?1, user_phone = ?2, user_surname = ?3 where user_mail = ?4 ").setParameter(1, admin.getName()).setParameter(2, admin.getPhone()).setParameter(3,admin.getSurname()).setParameter(4, admin.getMail()).executeUpdate();
			return admin;
	}
	
	@Override
	public Object updateOwner(Owner owner) {
			this.getEntityManager().createNativeQuery("update Owner set user_name = ?1, user_phone = ?2, user_surname = ?3 where user_mail = ?4 ").setParameter(1, owner.getName()).setParameter(2, owner.getPhone()).setParameter(3,owner.getSurname()).setParameter(4, owner.getMail()).executeUpdate();
			return owner;
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
