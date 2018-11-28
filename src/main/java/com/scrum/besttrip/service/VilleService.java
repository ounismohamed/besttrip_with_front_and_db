package com.scrum.besttrip.service;

import com.scrum.besttrip.model.Ville;
import com.scrum.besttrip.model.repository.VilleRepository;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VilleService {

    private VilleRepository villeRepository;


    public VilleService(VilleRepository villeRepository) {
        this.villeRepository = villeRepository;
    }

    public Iterable<Ville> getVilles (){
        return (List<Ville>) villeRepository.findAll();
//        Ville v1 = new Ville("Tunis","Tunisie");
//        Ville v2 = new Ville("Paris","France");
//        List<Ville> villes = new ArrayList<>();
//        villes.add(v1);
//        villes.add(v2);
//        return villes;
    }

    public List<Ville> getVilleByName(String name){
        return villeRepository.findByName(name);
    }


}
