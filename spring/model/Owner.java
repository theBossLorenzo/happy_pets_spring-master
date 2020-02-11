package ttps.spring.model;


import org.springframework.stereotype.Component;
import ttps.spring.model.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner extends User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "owner_id", unique = true, nullable = false)
	public Long owner_id;
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER,mappedBy = "owner")
	public List<Pet> pets;


	public List<Pet> getPets() {
		return pets;
	}


	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}


	public Owner(String name, String password, String surname, String phone, String mail) {
		super(name, password, surname, phone, mail);
		this.pets = new ArrayList<>();
		
	}

	public Owner() {
	}

	public void addPet(Pet pet) {
		getPets().add(pet);
	}
	
	public void deletePet(Pet pet) {
		getPets().remove(pet);
	}
	

}
