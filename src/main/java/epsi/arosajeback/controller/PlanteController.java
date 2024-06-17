package epsi.arosajeback.controller;

import epsi.arosajeback.dtos.GetPlanteEntretienDTO;
import epsi.arosajeback.dtos.GetPlanteEntretienHistoriqueDTO;
import epsi.arosajeback.dtos.LatLongDTO;
import epsi.arosajeback.dtos.PlantePositionDTO;
import epsi.arosajeback.entities.PlantePersonnelle;
import epsi.arosajeback.entities.Post;
import epsi.arosajeback.entities.Visite;
import epsi.arosajeback.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PlanteController {
    @Autowired
    PlantePersonnelleRepository plantePersonnelleRepository;
    @Autowired
    PhotoPlanteRepository photoPlanteRepository;
    @Autowired
    VisiteRepository visiteRepository;
    @Autowired
    PhotoVisiteRepository photoVisiteRepository;

    @PostMapping("/plantes/position")
    public List<PlantePositionDTO> getPlantePosition(@RequestBody LatLongDTO dto){
        float lat1 = (float) Math.toRadians(dto.getLatitude());
        float lon1 = (float) Math.toRadians(dto.getLatitude());
        List<PlantePersonnelle> plantePersonnelles = plantePersonnelleRepository.findAll();
        return plantePersonnelles.stream().filter(plantePersonnelle -> plantePersonnelle.getLatitude() != null && plantePersonnelle.getLongitude() != null).filter(plantePersonnelle -> dto.inRange(plantePersonnelle.getLatitude(), plantePersonnelle.getLongitude())).map(plantePersonnelle -> new PlantePositionDTO(plantePersonnelle.getLatitude(), plantePersonnelle.getLongitude(), plantePersonnelle.getIdPlantePerso())).toList();
    }

    @PostMapping("/plantes/distance")
    public float getPlantePosition(@RequestBody List<LatLongDTO> dto){
        return LatLongDTO.distanceFrom(dto.get(0), dto.get(1));
    }

    @GetMapping("/plante/{id}")
    public GetPlanteEntretienHistoriqueDTO getPost(@PathVariable int id) {
        PlantePersonnelle plantePersonnelle = plantePersonnelleRepository.findById(id).get();

        GetPlanteEntretienHistoriqueDTO dto = new GetPlanteEntretienHistoriqueDTO();
        dto.setNomPlante(plantePersonnelle.getPlante().getNomCommun());
        dto.setLienImagePrincipale(photoPlanteRepository.findByPlantePersonnelle(plantePersonnelle).get().getLien());
        dto.setLieu(plantePersonnelle.getAdresseApproximative());
        dto.setDateCreation(plantePersonnelle.getDateCreation());
        dto.setEntretiens(visiteRepository.findAllByPlantePersonnelle(plantePersonnelle).stream().map(visite -> {
                    return new GetPlanteEntretienDTO(visite.getGardien().getNom(), visite.getDateVisite(), visite.isProblemeEntretien(), visite.isProblemeSante(), visite.getMessage(), photoVisiteRepository.findAllByVisite(visite).stream().map(photo -> photo.getLien()).toList());
                }
        ).toList());
        return dto;
    }

    @GetMapping("/user/{idUser}/plantes")
    public List<PlantePersonnelle> getPlanteOfUser(@PathVariable int idUser){
        List<PlantePersonnelle> listPlante = plantePersonnelleRepository.findByUserId(idUser);
        return listPlante;
    }
}
