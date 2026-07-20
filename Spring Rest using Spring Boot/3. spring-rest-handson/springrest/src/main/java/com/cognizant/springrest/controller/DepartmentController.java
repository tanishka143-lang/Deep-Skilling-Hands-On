package com.cognizant.springrest.controller;

import com.cognizant.springrest.model.Department;
import com.cognizant.springrest.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }
}