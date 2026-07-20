package com.cognizant.orm_learn.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "skillList")
    private Set<Employee> employeeList;

    // getters & setters
}