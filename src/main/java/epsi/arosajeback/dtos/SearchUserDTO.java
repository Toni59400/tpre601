package epsi.arosajeback.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchUserDTO {
    private Integer idUser;
    private String lienPhotoProfile;
    private String dernierMessage;
    private Timestamp dateDernierMessage;
}
