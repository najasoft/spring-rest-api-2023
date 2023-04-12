package spring.cours.jpa.atelier2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import spring.cours.jpa.atelier2.model.Developpeur;
import spring.cours.jpa.atelier2.service.DevService;

import java.util.List;

@RestController
@RequestMapping("/devs")
public class DevController {
    @Autowired
    private DevService developpeurService;

    @GetMapping("")
    public ResponseEntity<List<Developpeur>> getAllDeveloppeurs() {
        List<Developpeur> developpeurs = developpeurService.getAllDeveloppeurs();
        return new ResponseEntity<>(developpeurs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Developpeur> getDeveloppeurById(@PathVariable("id") int id) {
        Developpeur developpeur = developpeurService.getDeveloppeurById(id);
        if (developpeur == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(developpeur, HttpStatus.OK);

        }
    }

    @PostMapping("")
    public ResponseEntity<Developpeur> saveDeveloppeur(@RequestBody Developpeur developpeur) {
        developpeur = developpeurService.saveDeveloppeur(developpeur);
        return new ResponseEntity<>(developpeur, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDeveloppeur(@PathVariable("id") int id) {
        developpeurService.deleteDeveloppeur(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
