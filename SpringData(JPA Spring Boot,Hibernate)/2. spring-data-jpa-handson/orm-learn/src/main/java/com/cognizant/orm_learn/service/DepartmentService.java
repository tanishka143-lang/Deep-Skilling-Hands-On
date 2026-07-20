package com.cognizant.orm_learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.orm_learn.model.Department;
import com.cognizant.orm_learn.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repo;

    public Department get(int id) {
        return repo.findById(id).get();
    }

    public void save(Department d) {
        repo.save(d);
    }
}
