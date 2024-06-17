package epsi.arosajeback.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostForum {

    @Id
    private Integer idPostForum;

    private String titre;
    private String description;


    @ManyToOne
    @JoinColumn(name = "creator")
    private User creator;
}
