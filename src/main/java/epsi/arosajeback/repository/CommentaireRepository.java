package epsi.arosajeback.repository;

import epsi.arosajeback.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepository extends JpaRepository<Commentaire, Integer> {
}