package epsi.arosajeback.repository;

import epsi.arosajeback.dtos.GetPlanteEntretienDTO;
import epsi.arosajeback.entities.PlantePersonnelle;
import epsi.arosajeback.entities.Visite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisiteRepository extends JpaRepository<Visite, Integer> {
    List<Visite> findAllByPlantePersonnelle(PlantePersonnelle plantePersonnelle);
}