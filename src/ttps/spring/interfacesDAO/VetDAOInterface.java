package ttps.spring.interfacesDAO;

import ttps.spring.model.Vet;

public interface VetDAOInterface extends GenericDAOInterface<Vet> {
	 public Vet recuperarVet(Long id);
	}