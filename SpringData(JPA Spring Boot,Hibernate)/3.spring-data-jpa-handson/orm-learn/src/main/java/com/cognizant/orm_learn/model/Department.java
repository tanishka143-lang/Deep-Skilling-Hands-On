package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

@Entity
public class Department {

    @Id
    private int id;

    private String name;

    public Department() {}

    // Getters and Setters
}