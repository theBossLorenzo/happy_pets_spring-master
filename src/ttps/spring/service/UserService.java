package ttps.spring.service;

import ttps.spring.clasesDAO.UserDAO;
import ttps.spring.interfacesDAO.UserDAOInterface;
import ttps.spring.model.User;

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
}
