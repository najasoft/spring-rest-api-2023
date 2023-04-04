package spring.cours.jpa.atelier2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spring.cours.jpa.atelier2.model.Projet;
import spring.cours.jpa.atelier2.model.ProjetDev;
import spring.cours.jpa.atelier2.model.ProjetRes;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
	@Query("Select dev from ProjetDev dev")
	List<ProjetDev> getProjetsDev();

	@Query("Select res from ProjetRes res")
	List<ProjetRes> getProjetsRes();

	public List<Projet> findByDescription(String description);
	
	@Query("Select pDev from ProjetDev pDev where pDev.idProjet=:idProjet")
	ProjetDev getProjetDev(@Param("idProjet") long idProjet);

}
