package ttps.spring.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("5")
public class SurgicalIntervention extends Event {
	
	public String description;

	public SurgicalIntervention(Date date, Vet vet, String description) {
		super(date, vet, description);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SurgicalIntervention() {
	}
	
	

}
