package epsi.arosajeback.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostTag {
    @EmbeddedId
    private PostTagId id;

    @Embeddable
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PostTagId {
        @ManyToOne
        @JoinColumn(name = "idPost")
        @JsonBackReference
        private PostForum post;

        @ManyToOne
        @JoinColumn(name = "nomTag")
        private Tag tag;
    }
}
