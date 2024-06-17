package epsi.arosajeback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class PlantePersonnelle {
    @Id
    private Integer idPlantePerso;
    private Integer nombre;
    private String adresseApproximative;
    private Float latitude;
    private Float longitude;
    private Timestamp dateCreation;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idPlante")
    private Plante plante;

    // Getters and setters
}
