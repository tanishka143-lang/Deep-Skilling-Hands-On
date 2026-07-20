package com.cognizant.springrest.dao;

import com.cognizant.springrest.model.Employee;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

@Repository
public class EmployeeDao {

    private static ArrayList<Employee> EMPLOYEE_LIST;

    public EmployeeDao() {
        try {
            ApplicationContext context =
                    new ClassPathXmlApplicationContext("employee.xml");

            EMPLOYEE_LIST = (ArrayList<Employee>) context.getBean("employeeList");

            System.out.println("Loaded Employees: " + EMPLOYEE_LIST.size()); // DEBUG

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}