package com.scrum.besttrip.model.repository;

import com.scrum.besttrip.model.Ville;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VilleRepository extends CrudRepository<Ville,String> {

    List<Ville> findByName(String name);
}
