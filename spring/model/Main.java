package ttps.spring.model;

import ttps.spring.clasesDAO.DaoFactory;

import java.util.Date;


public class Main {

	public static void main(String[] args) {
		Date today = new Date();
		// Objetos ejemplo
		 
		Vet vet1 = new Vet("Roqueskere", "1234", "Carlos", "4273795", "carlos@yahoo.com", "el perro feliz", "calle falsa");
		Admin admin1 = new Admin("Lorenzo", "1234", "Lorenzo", "4273723295", "lorenzoCarlos@yahoo.com");
		Owner owner = new Owner("Fede", "1234", "fedemozzon", "221163", "mozzonfederico@gmail.com");
		Visit visita = new Visit(vet1, today, 45, "Caca", "Tenia mucho dolor", "Cantar una cancion");
		Vaccine vacuna = new Vaccine(today, vet1, "HOLalalalal");
		
		
		// Se prueba persistencia
		
		DaoFactory.getVetDAO().persist(vet1);
		DaoFactory.getOwnerDAO().persist(owner);
		DaoFactory.getAdminDAO().persist(admin1);
		DaoFactory.getEventDAO().persist(visita);
		DaoFactory.getEventDAO().persist(vacuna);
		
		
		/*
		
		// Se prueba update
		
		Vet vet1 = DaoFactory.getVetDAO().recuperarVet((long) 1);
		Owner owner = DaoFactory.getOwnerDAO().recuperarOwner((long) 1);
		Pet pet1 = DaoFactory.getPetDAO().recuperarPet((long) 1);
		Admin admin1 = DaoFactory.getAdminDAO().recuperarAdmin((long) 1);
		Event visita = DaoFactory.getEventDAO().recuperarEvent((long) 1);
		Event vacuna = DaoFactory.getEventDAO().recuperarEvent((long) 1);
		
		vet1.setName("update");
		owner.setName("update");
		pet1.setName("update");
		admin1.setName("update");
		visita.setDate(null);
		vacuna.setDate(null);
	
		DaoFactory.getVetDAO().update(vet1);
		DaoFactory.getOwnerDAO().update(owner);
		DaoFactory.getPetDAO().update(pet1);
		DaoFactory.getAdminDAO().update(admin1);
		DaoFactory.getEventDAO().update(visita);
		DaoFactory.getEventDAO().update(vacuna);
		*/
		
		
		// Se prueba delete
		
		
		//Admin admin1 = DaoFactory.getAdminDAO().recuperarAdmin((long) 1);
		//DaoFactory.getAdminDAO().delete(admin1);
		//Event event1 = DaoFactory.getEventDAO().recuperarEvent((long) 2);
		//DaoFactory.getEventDAO().delete(event1);
		//Pet pet1 = DaoFactory.getPetDAO().recuperarPet((long) 2);
		//DaoFactory.getPetDAO().delete(pet1);
		//Owner owner1 = DaoFactory.getOwnerDAO().recuperarOwner((long) 1);
		//DaoFactory.getOwnerDAO().delete(owner1);
		//Vet vet1 = DaoFactory.getVetDAO().recuperarVet((long) 1);
		//DaoFactory.getVetDAO().delete(vet1);
		
		 /*
		// Se prueba "search" o busqueda
		
		System.out.println(DaoFactory.getEventDAO().recuperarEvent((long) 1).getDate());
		System.out.println(DaoFactory.getPetDAO().recuperarPet((long) 2).getName());
		System.out.println(DaoFactory.getVetDAO().recuperarVet((long) 1).getAddress());
		System.out.println(DaoFactory.getAdminDAO().recuperarAdmin((long) 1).getName());
		System.out.println(DaoFactory.getOwnerDAO().recuperarOwner((long) 1).getMail());
		
      */
	}

}
