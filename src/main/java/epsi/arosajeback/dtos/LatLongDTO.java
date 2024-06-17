package epsi.arosajeback.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LatLongDTO {
    private float latitude;
    private float longitude;
    private float portee;


    private static float deg2rad(float deg) {
        return (float) (deg * (Math.PI/180));
    }

    public boolean inRange(float lat, float lon){
        return LatLongDTO.distanceFrom(this, new LatLongDTO(lat, lon, 0)) <= portee;
    }

    public static float distanceFrom(LatLongDTO source, LatLongDTO target){
        float dLat = deg2rad(source.latitude - target.latitude);
        float dLon = deg2rad(source.longitude - target.longitude);
        float a = (float) (Math.sin(dLat/2) * Math.sin(dLat/2) +
                        Math.cos(deg2rad(target.latitude)) * Math.cos(deg2rad(source.latitude)) *
                                Math.sin(dLon/2) * Math.sin(dLon/2));
        float c = (float) (2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)));
        return 6371 * c;
    }
}
