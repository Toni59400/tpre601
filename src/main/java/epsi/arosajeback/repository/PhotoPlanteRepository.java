package epsi.arosajeback.repository;

import epsi.arosajeback.entities.PhotoPlante;
import epsi.arosajeback.entities.PlantePersonnelle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.ByteBuffer;
import java.util.Optional;

public interface PhotoPlanteRepository extends JpaRepository<PhotoPlante, Integer> {
    Optional<PhotoPlante> findByPlantePersonnelle(PlantePersonnelle plantePersonnelle);
}