package com.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryRunner implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public QueryRunner(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("Employees with salary > 50000 (HQL):");
        List<Employee> highSalary = employeeRepository.findBySalaryGreaterThan(50000);
        highSalary.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));

        System.out.println("\nEmployees in IT department (Native Query):");
        List<Employee> itEmployees = employeeRepository.findByDepartmentNative("IT");
        itEmployees.forEach(e -> System.out.println(e.getName() + " - " + e.getDepartment()));
    }
}
