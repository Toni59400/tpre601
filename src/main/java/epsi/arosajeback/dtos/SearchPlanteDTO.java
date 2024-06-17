package epsi.arosajeback.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchPlanteDTO {
    private Integer idPlante;
    private String nomPlante;
    private String lieu;
    private Timestamp dateDernierEntretien;
    private Timestamp dateCreation;
    private String lienImage;
}
