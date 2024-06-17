package epsi.arosajeback.entities;

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
public class TagsPlante {
    @EmbeddedId
    private TagsPlanteId id;

    @Embeddable
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TagsPlanteId {
        @ManyToOne
        @JoinColumn(name = "idPost")
        private Post post;

        @ManyToOne
        @JoinColumn(name = "idPlante")
        private Plante plante;
    }

    // Getters and setters
}
