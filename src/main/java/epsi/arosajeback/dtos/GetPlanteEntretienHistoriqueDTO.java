package epsi.arosajeback.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetPlanteEntretienHistoriqueDTO {
    private String nomPlante;
    private String lienImagePrincipale;
    private Timestamp dateCreation;
    private String lieu;
    private List<GetPlanteEntretienDTO> entretiens;
}
