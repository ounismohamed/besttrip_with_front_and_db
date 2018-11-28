package com.scrum.besttrip.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VILLE")
public class Ville {

    @Id
    @Column(name="NAME")
    private String name;

    @Column(name = "PAYS")
    private String pays;
    //private Guide guide;
    //private List<Experience> experiences;

    public Ville(String nom, String pays) {
        this.name = nom;
        this.pays = pays;
    }

    public Ville(){}

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

//    public Guide getGuide() {
//        return guide;
//    }
//
//    public void setGuide(Guide guide) {
//        this.guide = guide;
//    }
//
//    public List<Experience> getExperiences() {
//        return experiences;
//    }
//
//    public void setExperiences(List<Experience> experiences) {
//        this.experiences = experiences;
//    }
}
