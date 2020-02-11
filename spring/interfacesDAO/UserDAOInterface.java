package ttps.spring.interfacesDAO;
import ttps.spring.model.Admin;
import ttps.spring.model.Owner;
import ttps.spring.model.User;
import ttps.spring.model.Vet;

import java.util.List;

public interface UserDAOInterface extends GenericDAOInterface<User> {

    public List<User> getAllUsers();

	public boolean getUser(String mail, String password);

	public Boolean getUser(User user);

	public Object findUser(String mail, String password);

	public Object updateVet(Vet vet);

	public Object updateAdmin(Admin admin);

	public Object updateOwner(Owner owner);


}
