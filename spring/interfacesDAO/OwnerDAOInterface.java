package ttps.spring.interfacesDAO;

import ttps.spring.model.Owner;

public interface OwnerDAOInterface extends GenericDAOInterface<Owner> {
	 public Owner recuperarOwner(Long id);
	}
