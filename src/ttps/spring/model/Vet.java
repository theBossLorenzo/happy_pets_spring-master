package ttps.spring.model;

import ttps.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Vet")
@Component
public class Vet extends User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vet_id", unique = true, nullable = false)
	public Long vet_id;
	public String clinicName;
	public String address;
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER,mappedBy = "vet")
	public List<Pet> pets = new ArrayList<Pet>();
		
	public Vet() {
	}
	
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	public String getClinicName() {
		return clinicName;
	}
	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Vet(String name, String password, String surname, String phone, String mail, String clinicName, String address) {
		super(name,password,surname,phone,mail);
		this.address = address;
		this.clinicName = clinicName;
	}

	public Long getVet_id() {
		return vet_id;
	}

	public void setVet_id(Long vet_id) {
		this.vet_id = vet_id;
	}
	
	

}
