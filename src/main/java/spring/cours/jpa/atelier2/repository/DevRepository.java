package spring.cours.jpa.atelier2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.cours.jpa.atelier2.model.Developpeur;

@Repository
public interface DevRepository extends JpaRepository<Developpeur, Integer> {
	Developpeur findByEmail(String email);

	Developpeur findByNom(String nom);

}
