package ttps.spring.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Deparacitation extends Event {
	
	public String drug;
	public String result;
	
	public Deparacitation(Date date, Vet vet, String drug, String result) {
		super(date, vet);
		this.drug = drug;
		this.result = result;
	}

	public String getDrug() {
		return drug;
	}

	public void setDrug(String drug) {
		this.drug = drug;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Deparacitation() {
	}
	
	
	
	

}
