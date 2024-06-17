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
public class Soccuper {
    @EmbeddedId
    private SoccuperId id;

    private Integer nombreAGarder;

    @Embeddable
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SoccuperId{
        @ManyToOne
        @JoinColumn(name = "idVisite")
        private Visite visite;

        @ManyToOne
        @JoinColumn(name = "idPlantePerso")
        private PlantePersonnelle plantePerso;
    }

    // Getters and setters
}
