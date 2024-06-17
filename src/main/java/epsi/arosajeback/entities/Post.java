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
public class Post {
    @Id
    private Integer idPost;
    private String titre;
    private String text;
    private boolean demandeGarde;
    private Timestamp dateCreation;
    private Timestamp dateDernierModif;
    private String adresseAproximative;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    @OneToOne
    @JoinColumn(name = "idVisite", unique = true)
    private Visite visite;

    // Getters and setters
}