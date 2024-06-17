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
public class GetPlanteEntretienDTO {
    private String nomGardien;
    private Timestamp dateEntretien;
    private boolean problemeEntretien;
    private boolean problemeSante;
    private String commentaire;
    private List<String> lienImages;
}
