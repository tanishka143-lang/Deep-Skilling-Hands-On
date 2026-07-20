package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void testQueryMethods() throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("🔹 Containing:");
        List<Employee> list1 = employeeRepository.findByEmpNameContaining("an");
        list1.forEach(e -> System.out.println(e.getEmpName()));

        System.out.println("🔹 Starting With:");
        List<Employee> list2 = employeeRepository.findByEmpNameStartingWith("A");
        list2.forEach(e -> System.out.println(e.getEmpName()));

        System.out.println("🔹 Salary > 50000:");
        employeeRepository.findBySalaryGreaterThan(50000)
                .forEach(e -> System.out.println(e.getEmpName()));

        System.out.println("🔹 Salary < 50000:");
        employeeRepository.findBySalaryLessThan(50000)
                .forEach(e -> System.out.println(e.getEmpName()));

        System.out.println("🔹 Top 3 Salaries:");
        employeeRepository.findTop3ByOrderBySalaryDesc()
                .forEach(e -> System.out.println(e.getEmpName()));

        System.out.println("🔹 DOB Between:");
        employeeRepository.findByDateOfBirthBetween(
                sdf.parse("1990-01-01"),
                sdf.parse("2005-01-01")
        ).forEach(e -> System.out.println(e.getEmpName()));
    }
}
