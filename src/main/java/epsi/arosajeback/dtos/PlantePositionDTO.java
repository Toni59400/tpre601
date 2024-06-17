package epsi.arosajeback.dtos;

import epsi.arosajeback.entities.Plante;
import epsi.arosajeback.entities.PlantePersonnelle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PlantePositionDTO {
    private float latitude;
    private float longitude;
    private int idPlantePerso;
}
