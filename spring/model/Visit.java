package ttps.spring.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("6")
public class Visit extends Event {
	
	public Integer peso;
	public String motivo;
	public String diagnostico;
	public String indicaciones;
	
	public Visit(Vet vet, Date date, Integer peso, String motivo, String diagnostico, String indicaciones) {
		super(date, vet);
		this.peso = peso;
		this.motivo = motivo;
		this.diagnostico = diagnostico;
		this.indicaciones = indicaciones;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getIndicaciones() {
		return indicaciones;
	}

	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}

	public Visit() {
	}
	
	
	

}
