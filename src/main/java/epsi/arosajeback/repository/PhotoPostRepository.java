package epsi.arosajeback.repository;

import epsi.arosajeback.entities.PhotoPost;
import epsi.arosajeback.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.ByteBuffer;
import java.util.Optional;

public interface PhotoPostRepository extends JpaRepository<PhotoPost, Integer> {
}