package com.scrum.besttrip.rest;
import com.scrum.besttrip.model.Ville;
import com.scrum.besttrip.service.VilleService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VilleRestController {

    private VilleService villeService;

    public VilleRestController(VilleService villeService) {
        this.villeService = villeService;
    }

    @RequestMapping(method = RequestMethod.GET,
    path = "/api/besttrip/villes",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Ville> getVilles(){
        System.out.println("#########################");
        return villeService.getVilles();
    }
}
