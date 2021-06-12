package com.example.h2zoo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Amphibian {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String species;
    private String color;
    private String habitat;

    public Amphibian(String name, String species, String color, String habitat) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.habitat = habitat;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getHabitat() {
        return habitat;
    }
}
