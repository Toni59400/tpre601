package epsi.arosajeback.repository;

import epsi.arosajeback.entities.PlantePersonnelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlantePersonnelleRepository extends JpaRepository<PlantePersonnelle, Integer> {
    @Query("SELECT p FROM PlantePersonnelle p WHERE p.user.idUser = :userId")
    List<PlantePersonnelle> findByUserId(Integer userId);
}