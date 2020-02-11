package ttps.spring.interfacesDAO;

import ttps.spring.model.Admin;

public interface AdminDAOInterface extends GenericDAOInterface<Admin> {
	 public Admin recuperarAdmin(Long id);
	}