package epsi.arosajeback.repository;

import epsi.arosajeback.entities.PhotoMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoMessageRepository extends JpaRepository<PhotoMessage, Integer> {
}