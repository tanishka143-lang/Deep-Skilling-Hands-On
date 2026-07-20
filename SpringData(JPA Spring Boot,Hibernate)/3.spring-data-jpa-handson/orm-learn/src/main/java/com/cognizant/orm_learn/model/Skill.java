package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

@Entity
public class Skill {

    @Id
    private int id;

    private String name;

    public Skill() {}

    // Getters and Setters
}