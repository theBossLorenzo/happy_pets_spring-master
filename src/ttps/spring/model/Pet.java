package ttps.spring.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Pet")
public class Pet {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pet_id", unique = true, nullable = false)
	private Long pet_id;
	public String name;
	public Date birthday;
	public String specie;
	public String race;
	public String sex;
	public String colour;
	public String signs;
	//public Image picture;
	//public ArrayList<Event> events;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "owner_id")
	public Owner owner;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "vet_id")
	public Vet vet;
	
	public Pet() {
	}
	
	public Pet(String name, Date birthday, String specie, String race, String sex, String colour,
			String signs, Vet vet, Owner owner) {
		this.name = name;
		this.birthday = birthday;
		this.specie = specie;
		this.race = race;
		this.sex = sex;
		this.colour = colour;
		this.signs = signs;
		//this.picture = picture;
		//this.events = new ArrayList<Event> ();
		this.owner = owner;
		this.vet = vet;
	}

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSpecie() {
		return specie;
	}
	public void setSpecie(String specie) {
		this.specie = specie;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSigns() {
		return signs;
	}
	public void setSigns(String signs) {
		this.signs = signs;
	}
	/*public Image getPicture() {
		return picture;
	}
	public void setPicture(Image picture) {
		this.picture = picture;
	}*/
	/*public ArrayList<Event> getEvents() {
		return events;
	}
	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}
	*/
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public Vet getVet() {
		return vet;
	}
	public void setVet(Vet vet) {
		this.vet = vet;
	}
	
	/*public void addEvent(Event event) {
		getEvents().add(event);
	}
	
	public void deleteEvent(Event event) {
		getEvents().remove(event);
	}*/

}
