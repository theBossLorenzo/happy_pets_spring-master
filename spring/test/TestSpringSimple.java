package ttps.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ttps.spring.clasesDAO.UserDAO;
import ttps.spring.interfacesDAO.PetDAOInterface;
import ttps.spring.interfacesDAO.UserDAOInterface;
import ttps.spring.model.Admin;
import ttps.spring.model.Owner;
import ttps.spring.model.Pet;
import ttps.spring.model.Vet;

import java.util.Date;

public class TestSpringSimple {
   public static void main(String[] args) {
	   AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

	   //registra una o más componentes que serán procesadas

	   ctx.register(ttps.spring.config.PersistenceConfig.class);

	   //Busca clases anotadas en el paquete base pasado por parámetro

	   ctx.scan("ttps");

	   ctx.refresh();

	   UserDAOInterface userDAO = ctx.getBean("userDAO", UserDAOInterface.class);
	   PetDAOInterface petDAO = ctx.getBean("petDAO", PetDAOInterface.class);

       Vet vet = new Vet();
       Owner owner = new  Owner();
       Date cumpleanos = new Date();
       Pet pet = new Pet("Fidel", cumpleanos, "perro", "macho", "negro y blanco", "ninguna","ninguna", vet, owner);
	   Admin admin1 = new Admin("Lorenzo", "1234", "Lorenzo", "4273723295", "lorenzoCarlos@yahoo.com");

	   userDAO.persist(admin1);
	   userDAO.persist(owner);
	   userDAO.persist(vet);
	   petDAO.persist(pet);
	   Long numero = new Long(1);
	   System.out.println(petDAO.recuperarTodasLasMascotasParaUnOwner(numero).size());
	   System.out.println(userDAO.getAllUsers().size());
	   
	   
	   }
	}
