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
public class Plante {
    @Id
    private Integer idPlante;
    private String nomScientifique;
    private String nomCommun;

    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Category category;

    // Getters and setters
}
