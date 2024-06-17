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
public class Addresse {
    @Id
    private Integer idAdresse;
    private String codePostal;
    private String ville;
    private String typeDeVoie;
    private String nomDeLaVoie;
    private String pays;
    private String numeroDeLaVoie;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    // Getters and setters
}
