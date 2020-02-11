package ttps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ttps.spring.clasesDAO.PetDAO;
import ttps.spring.interfacesDAO.PetDAOInterface;
import ttps.spring.model.Pet;

import java.util.List;

@Service
public class PetService {
	
	@Autowired
	PetDAOInterface petDAO;

    public List<Pet> getAllPets(long id){
        return petDAO.recuperarTodasLasMascotasParaUnOwner(id);
    }
    public boolean isPetExist(Pet pet) {
        return petDAO.verificarExistencia(pet.getName());
    }

    public Pet savePet(Pet pet) {
    	return petDAO.persist(pet);
    }
}
