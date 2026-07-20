package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // 🔹 Query Methods

    List<Employee> findByEmpNameContaining(String text);

    List<Employee> findByEmpNameStartingWith(String prefix);

    List<Employee> findBySalaryGreaterThan(double salary);

    List<Employee> findBySalaryLessThan(double salary);

    List<Employee> findTop3ByOrderBySalaryDesc();

    List<Employee> findByDateOfBirthBetween(Date start, Date end);
}