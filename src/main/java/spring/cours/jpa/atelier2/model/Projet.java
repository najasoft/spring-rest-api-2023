package spring.cours.jpa.atelier2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;

@Entity
@Inheritance
public class Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProjet;

	@Column(length = 120)
	private String description;

	public long getIdProjet() {
		return idProjet;
	}

	public void setIdProjet(long id) {
		this.idProjet = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
