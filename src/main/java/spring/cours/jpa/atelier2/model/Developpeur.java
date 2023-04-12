package spring.cours.jpa.atelier2.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Developpeur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dev_id;

	@Column(nullable = false)
	private String nom;

	@Column(unique = true)
	private String email;

	@ManyToMany
	@JoinTable(name = "taches_dev", 
	joinColumns = @JoinColumn(name = "dev_id"), 
	inverseJoinColumns = @JoinColumn(name = "tache_id"))
	private List<Tache> taches;

	public int getDev_id() {
		return dev_id;
	}

	public void setDev_id(int dev_id) {
		this.dev_id = dev_id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
}