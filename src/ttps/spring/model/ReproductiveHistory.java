package ttps.spring.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class ReproductiveHistory extends Event {
	
	public Date dueDate;
	public Integer puppies;
	
	public ReproductiveHistory(Date date, Vet vet, Date dueDate, Integer puppies) {
		super(date, vet);
		this.dueDate = dueDate;
		this.puppies = puppies;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getPuppies() {
		return puppies;
	}

	public void setPuppies(Integer puppies) {
		this.puppies = puppies;
	}

	public ReproductiveHistory() {
	}
	

}
