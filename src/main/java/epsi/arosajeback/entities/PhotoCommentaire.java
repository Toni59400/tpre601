package epsi.arosajeback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhotoCommentaire {
    @Id
    private Integer idPhotoCommentaire;
    private String lien;

    @ManyToOne
    @JoinColumn(name = "idCommentaire")
    private Commentaire commentaire;

    // Getters and setters
}
