package com.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public DataLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DataLoader running...");
        // Clean existing data if any
        employeeRepository.deleteAll();

        employeeRepository.save(new Employee(1, "Alice", "IT", 60000));
        employeeRepository.save(new Employee(2, "Bob", "HR", 45000));
        employeeRepository.save(new Employee(3, "Charlie", "IT", 70000));
    }
}
