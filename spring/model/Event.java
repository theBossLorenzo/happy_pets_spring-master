package ttps.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance
@DiscriminatorColumn(discriminatorType = DiscriminatorType.INTEGER, name = "tipo_evento")
public class Event {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id", unique = true, nullable = false)
	public Long id;
	public Date date;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Vet_id")
	public Vet vet;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Event() {
	}

	public Event(Date date, Vet vet, String description) {
		this.date = date;
		this.vet = vet;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Vet getVet() {
		return vet;
	}
	public void setVet(Vet vet) {
		this.vet = vet;
	}

	public Event(Date date, Vet vet) {
		this.date = date;
		this.vet = vet;
	}
	
	
	
}
