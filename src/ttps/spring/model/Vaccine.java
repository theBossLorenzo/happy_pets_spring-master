package ttps.spring.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("4")
public class Vaccine extends Event {
	
	public String description;

	public Vaccine(Date date, Vet vet, String description) {
		super(date, vet);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Vaccine() {
	}
	
	

}
