package epsi.arosajeback.repository;

import epsi.arosajeback.entities.PostTag;
import epsi.arosajeback.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostTagRepository extends JpaRepository<PostTag, Integer> {
    @Query("SELECT pt.id.tag FROM PostTag pt WHERE pt.id.post.idPostForum = :postForumId")
    List<Tag> findTagsByPostForumId(@Param("postForumId") Integer postForumId);
}
