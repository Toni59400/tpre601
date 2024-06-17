package epsi.arosajeback.repository;

import epsi.arosajeback.entities.PostForum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostForumRepository extends JpaRepository<PostForum, Integer> {

}
