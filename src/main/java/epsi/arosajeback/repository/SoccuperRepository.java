package epsi.arosajeback.repository;

import epsi.arosajeback.entities.Soccuper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoccuperRepository extends JpaRepository<Soccuper, Soccuper.SoccuperId> {
}