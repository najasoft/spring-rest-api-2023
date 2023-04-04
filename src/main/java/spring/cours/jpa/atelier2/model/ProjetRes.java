package spring.cours.jpa.atelier2.model;

import jakarta.persistence.Entity;

@Entity
public class ProjetRes extends Projet {

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
