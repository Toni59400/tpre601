package epsi.arosajeback.repository;

import epsi.arosajeback.entities.TagsPlante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsPlanteRepository extends JpaRepository<TagsPlante, TagsPlante.TagsPlanteId> {
}