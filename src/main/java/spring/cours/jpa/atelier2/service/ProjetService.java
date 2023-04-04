package spring.cours.jpa.atelier2.service;

import java.util.List;

import spring.cours.jpa.atelier2.model.Projet;
import spring.cours.jpa.atelier2.model.ProjetDev;
import spring.cours.jpa.atelier2.model.ProjetRes;

public interface ProjetService {

	public List<Projet> lesProjets();

	public List<ProjetDev> getProjetsDev();

	public List<ProjetRes> getProjetRes();

	public Projet ajouterProjet(Projet p);

	public ProjetDev ajouterProjetDev(ProjetDev p);

	public ProjetRes ajouterProjetRes(ProjetRes p);

	public void supprimerProjet(long id);

	public Projet modifierProjet(Projet projet);

	public List<Projet> getByDescription(String description);

	public Projet getById(long id);

	ProjetDev modifierProjetDev(ProjetDev projet);

}
