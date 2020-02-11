package ttps.spring.model;

import ttps.spring.model.User;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Admin extends User {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	
	public Admin(String name, String password, String surname, String phone, String mail) {
		super(name, password, surname, phone, mail);
	}

}
