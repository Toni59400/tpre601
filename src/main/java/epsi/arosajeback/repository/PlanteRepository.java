package epsi.arosajeback.repository;

import epsi.arosajeback.entities.Plante;
import epsi.arosajeback.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.ByteBuffer;
import java.util.Optional;

public interface PlanteRepository extends JpaRepository<Plante, Integer> {
}