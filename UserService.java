package ttps.spring.service;

import ttps.spring.clasesDAO.UserDAO;
import ttps.spring.interfacesDAO.UserDAOInterface;
import ttps.spring.model.Admin;
import ttps.spring.model.Owner;
import ttps.spring.model.User;
import ttps.spring.model.Vet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserDAOInterface userDao;
	
    public boolean getUser(User user){
    	System.out.println(user);
        return userDao.getUser(user.getMail(),user.getPassword());
    }
    
    public Object findUser(User user) {
    	return userDao.findUser(user.getMail(), user.getPassword());
    }

	public User saveUser(User user) {
		return userDao.persist(user);
		
	}

	public User updateUser(User user) {
		return userDao.update(user);
		
	}

	public Object updateVet(Vet vet) {
		return userDao.updateVet(vet);
		
	}
	
	public Object updateAdmin(Admin admin) {
		return userDao.updateAdmin(admin);
		
	}
	
	public Object updateOwner(Owner owner) {
		return userDao.updateOwner(owner);
		
	}
	
	 public Object saveVet(Vet vet) {
	    return userDao.persist(vet);
	}
	    
	public Object saveOwner(Owner owner) {
	    return userDao.persist(owner);
    }
	    
	public Object saveAdmin(Admin admin) {
	    	return userDao.persist(admin);
	}
}
