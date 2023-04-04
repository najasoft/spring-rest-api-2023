package spring.cours.jpa.atelier2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.cours.jpa.atelier2.model.Projet;
import spring.cours.jpa.atelier2.model.ProjetDev;
import spring.cours.jpa.atelier2.model.ProjetRes;
import spring.cours.jpa.atelier2.repository.ProjetRepository;

@Service
public class ProjetServiceImpl implements ProjetService {
	@Autowired
	ProjetRepository projetRepository;

	@Override
	public List<Projet> lesProjets() {
		return projetRepository.findAll();
	}

	@Override
	public List<ProjetDev> getProjetsDev() {
		return projetRepository.getProjetsDev();
	}

	@Override
	public List<ProjetRes> getProjetRes() {
		return projetRepository.getProjetsRes();
	}

	@Override
	public Projet ajouterProjet(Projet p) {
		return projetRepository.save(p);
	}

	@Override
	public ProjetDev ajouterProjetDev(ProjetDev p) {
		return projetRepository.save(p);
	}

	@Override
	public ProjetRes ajouterProjetRes(ProjetRes p) {
		return projetRepository.save(p);
	}

	@Override
	public void supprimerProjet(long id) {

		projetRepository.deleteById(id);
		;
	}

	@Override
	public Projet modifierProjet(Projet projet) {
		Optional<Projet> resultat = projetRepository.findById(projet.getIdProjet());
		if (resultat.isPresent()) {
			Projet p = resultat.get();
			p.setDescription(projet.getDescription());
			return projetRepository.save(p);
		}
		return null;
	}

	@Override
	public ProjetDev modifierProjetDev(ProjetDev projet) {
		ProjetDev p = projetRepository.getProjetDev(projet.getIdProjet());
		p.setDescription(projet.getDescription());
		p.setLangage(projet.getLangage());
		return projetRepository.save(p);
	}

	@Override
	public List<Projet> getByDescription(String description) {
		return projetRepository.findByDescription(description);
	}

	@Override
	public Projet getById(long id) {

		return projetRepository.findById(id).get();
	}

}
