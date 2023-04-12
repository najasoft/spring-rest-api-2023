package spring.cours.jpa.atelier2.service;
import spring.cours.jpa.atelier2.model.Developpeur;

import java.util.List;
public interface DevService {
        List<Developpeur> getAllDeveloppeurs();
        Developpeur getDeveloppeurById(int id);
        Developpeur saveDeveloppeur(Developpeur developpeur);
        void deleteDeveloppeur(int id);
    }
