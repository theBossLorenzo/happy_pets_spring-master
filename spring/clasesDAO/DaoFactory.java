package ttps.spring.clasesDAO;

public class DaoFactory {
	
 public static AdminDAO getAdminDAO() {
 return new AdminDAO();
 }
 
 public static EventDAO getEventDAO() {
	 return new EventDAO();
  }
 
 public static OwnerDAO getOwnerDAO() {
	 return new OwnerDAO();
	 }
 
 public static PetDAO getPetDAO() {
	 return new PetDAO();
	 }
 
 public static VetDAO getVetDAO() {
	 return new VetDAO();
	 }
 
 
 
 } 
