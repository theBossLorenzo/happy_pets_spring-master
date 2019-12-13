package ttps.spring.interfacesDAO;
import ttps.spring.model.User;

import java.util.List;

public interface UserDAOInterface extends GenericDAOInterface<User> {

    public List<User> getAllUsers();

	public boolean getUser(String mail, String password);

	public Boolean getUser(User user);

	public Object findUser(String mail, String password);

}
