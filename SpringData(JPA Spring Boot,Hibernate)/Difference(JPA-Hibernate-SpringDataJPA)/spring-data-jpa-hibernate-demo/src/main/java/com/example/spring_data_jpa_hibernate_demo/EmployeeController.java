package com.example.spring_data_jpa_hibernate_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/add")
    public String addEmployee() {
        Employee emp = new Employee();
        emp.setName("John");
        emp.setSalary(50000);
        service.addEmployee(emp);
        return "Employee Added Successfully";
    }
}