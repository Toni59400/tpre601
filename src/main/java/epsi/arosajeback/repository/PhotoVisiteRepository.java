package epsi.arosajeback.repository;

import epsi.arosajeback.entities.PhotoVisite;
import epsi.arosajeback.entities.Visite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhotoVisiteRepository extends JpaRepository<PhotoVisite, Integer> {
    List<PhotoVisite> findAllByVisite(Visite visite);
}