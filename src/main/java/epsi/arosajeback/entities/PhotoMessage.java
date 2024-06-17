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
public class PhotoMessage {
    @Id
    private Integer idPhotoMessage;
    private String lien;

    @ManyToOne
    @JoinColumn(name = "idMessages")
    private Message message;

    // Getters and setters
}
