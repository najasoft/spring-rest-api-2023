package spring.cours.jpa.atelier2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.cours.jpa.atelier2.model.Developpeur;
import spring.cours.jpa.atelier2.repository.DevRepository;

import java.util.List;

@Service
public class DevServiceImpl  implements   DevService{
    @Autowired
    private DevRepository developpeurRepository;

    @Override
    public List<Developpeur> getAllDeveloppeurs() {
        return developpeurRepository.findAll();
    }

    @Override
    public Developpeur getDeveloppeurById(int id) {
        return developpeurRepository.findById(id).orElse(null);
    }

    @Override
    public Developpeur saveDeveloppeur(Developpeur developpeur) {
        return developpeurRepository.save(developpeur);
    }

    @Override
    public void deleteDeveloppeur(int id) {
        developpeurRepository.deleteById(id);
    }

}
