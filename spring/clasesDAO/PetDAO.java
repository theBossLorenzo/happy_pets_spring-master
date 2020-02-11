 package ttps.spring.clasesDAO;


import ttps.spring.interfacesDAO.PetDAOInterface;
import ttps.spring.model.Pet;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetDAO extends GenericDao<Pet> implements PetDAOInterface {
    public PetDAO() { super(Pet.class);
    }


    @Override
    public Pet recuperarPet(Long id) {
        return null;
    }

    @Override
    public List<Pet> recuperarTodasLasMascotasParaUnOwner(Long id) {
        return this.getEntityManager().createNativeQuery("select * from Pet p where p.owner_id = ?1").setParameter(1, id).getResultList();
    }
    
    public List<Pet> recuperarMascota(String nombre) {
        return this.getEntityManager().createNativeQuery("select * from Pet p where p.name = ?1").setParameter(1, nombre).getResultList();
    }
    
    public boolean verificarExistencia(String nombre) {
    	System.out.print(recuperarMascota(nombre));
    	return recuperarMascota(nombre).isEmpty();
    }

    @Override
    public List<Pet> recuperarTodasLasMascotasParaUnVet(Long id) {
        return null;
    }
}
