package com.cognizant.springrest.model;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Department department;
    private List<String> skills;

    public Employee() {}

    public Employee(int id, String name, double salary, Department department, List<String> skills) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    // getters and setters
}