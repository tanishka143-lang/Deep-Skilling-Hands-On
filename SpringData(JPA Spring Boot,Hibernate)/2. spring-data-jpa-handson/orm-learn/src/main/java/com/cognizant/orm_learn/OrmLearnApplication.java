package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.EmployeeService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Override
	public void run(String... args) {
		testGetEmployee();
	}

	public void testGetEmployee() {
		Employee e = employeeService.get(1);
		System.out.println(e);
	}
}