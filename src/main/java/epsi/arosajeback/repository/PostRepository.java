package epsi.arosajeback.repository;

import epsi.arosajeback.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}