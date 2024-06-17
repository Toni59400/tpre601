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
public class PhotoVisite {
    @Id
    private Integer idPhotoVisite;
    private String lien;

    @ManyToOne
    @JoinColumn(name = "idPlantePersonnelle")
    private PlantePersonnelle plantePersonnelle;

    @ManyToOne
    @JoinColumn(name = "idVisite")
    private Visite visite;

    // Getters and setters
}
