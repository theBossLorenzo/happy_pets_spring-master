package ttps.spring.interfacesDAO;

import ttps.spring.model.Pet;

import java.util.List;


public interface PetDAOInterface extends GenericDAOInterface<Pet>{
	
	public Pet recuperarPet(Long id);
	public List<Pet> recuperarTodasLasMascotasParaUnOwner(Long id);
	public List<Pet> recuperarTodasLasMascotasParaUnVet(Long id);
	public boolean verificarExistencia(String nombre);

}
