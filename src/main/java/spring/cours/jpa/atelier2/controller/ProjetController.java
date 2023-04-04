package spring.cours.jpa.atelier2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import spring.cours.jpa.atelier2.model.Projet;
import spring.cours.jpa.atelier2.model.ProjetDev;
import spring.cours.jpa.atelier2.model.ProjetRes;
import spring.cours.jpa.atelier2.service.ProjetService;

@RestController
@RequestMapping("/projets")
@CrossOrigin("http://localhost:3000")
public class ProjetController {
	@Autowired
	ProjetService projetService;

	@Operation(description = "Pour obtenir la liste des projets")
	@GetMapping
	public List<Projet> lesProjets() {
		return projetService.lesProjets();
	}

	@GetMapping("/dev")
	public List<ProjetDev> getProjetsDev() {
		return projetService.getProjetsDev();
	}

	@GetMapping("/res")
	public List<ProjetRes> getProjetRes() {
		return projetService.getProjetRes();
	}

	@PostMapping
	public Projet ajouterProjet(@RequestBody Projet p) {
		return projetService.ajouterProjet(p);
	}

	@PostMapping("/dev")
	public ProjetDev ajouterProjetDev(@RequestBody ProjetDev p) {
		return projetService.ajouterProjetDev(p);
	}

	@PostMapping("/res")
	public ProjetRes ajouterProjetRes(@RequestBody ProjetRes p) {
		return projetService.ajouterProjetRes(p);
	}

	@DeleteMapping("/{id}")
	public void del(@PathVariable long id) {
		projetService.supprimerProjet(id);
	}

	@DeleteMapping("/dev/{id}")
	public void delProjetDev(@PathVariable long id) {
		projetService.supprimerProjet(id);
	}

	@PutMapping
	public Projet modifierProjet(@RequestBody Projet projet) {
		return projetService.modifierProjet(projet);
	}
	

	@PutMapping("/dev")
	public Projet modifierProjetDev(@RequestBody ProjetDev projet) {
		return projetService.modifierProjet(projet);
	}

	@GetMapping("/{id}")
	public Projet getProjet(@PathVariable long id) {
		return projetService.getById(id);
	}

	// Obtenir un projet par description
	@GetMapping("/desc")
	public List<Projet> getProjets(@RequestParam("d") String description) {
		return projetService.getByDescription(description);
	}

}
