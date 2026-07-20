package com.cognizant.orm_learn.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", permanent=" + permanent +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double salary;
    private boolean permanent;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    // MANY TO ONE
    @ManyToOne
    @JoinColumn(name = "em_dp_id")
    private Department department;

    // MANY TO MANY
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "employee_skill",
            joinColumns = @JoinColumn(name = "es_em_id"),
            inverseJoinColumns = @JoinColumn(name = "es_sk_id")
    )
    private Set<Skill> skillList;

    // getters & setters
}