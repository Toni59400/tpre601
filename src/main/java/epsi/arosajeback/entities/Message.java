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
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id
    private Integer idMessages;
    private String texte;
    private String dateHeureMessage;
    private boolean isActive;
    private boolean sens;

    @ManyToOne
    @JoinColumn(name = "idConversation")
    private Conversation conversation;

    // Getters and setters
}
