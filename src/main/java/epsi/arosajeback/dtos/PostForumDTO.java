package epsi.arosajeback.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import epsi.arosajeback.entities.PostForum;
import epsi.arosajeback.entities.Tag;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
public class PostForumDTO {
    private PostForum post;
    private List<Tag> tags;

    public PostForumDTO(PostForum post, List<Tag> tags) {
        this.post = post;
        this.tags = tags;
    }

    // Getters et setters
    @JsonProperty("post")
    public PostForum getPost() {
        return post;
    }

    public void setPost(PostForum post) {
        this.post = post;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
