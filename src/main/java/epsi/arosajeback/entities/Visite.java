package epsi.arosajeback.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Visite {
    @Id
    private Integer idVisite;
    private Timestamp dateVisite;
    private boolean visiteFaite = false;
    private boolean problemeEntretien = false;
    private boolean problemeSante = false;
    private String message;

    @ManyToOne
    @JoinColumn(name = "idPlantePersonnelle")
    private PlantePersonnelle plantePersonnelle;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User gardien;

    // Getters and setters
}
