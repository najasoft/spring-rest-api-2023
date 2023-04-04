package spring.cours.jpa.atelier2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Tache {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tache_id;
	private Date duree;

	@ManyToOne
	private ProjetDev projet;

	public int getTache_id() {
		return tache_id;
	}

	public void setTache_id(int tache_id) {
		this.tache_id = tache_id;
	}

	public Date getDuree() {
		return duree;
	}

	public void setDuree(Date duree) {
		this.duree = duree;
	}

	public ProjetDev getProjet() {
		return projet;
	}

	public void setProjet(ProjetDev projet) {
		this.projet = projet;
	}
}