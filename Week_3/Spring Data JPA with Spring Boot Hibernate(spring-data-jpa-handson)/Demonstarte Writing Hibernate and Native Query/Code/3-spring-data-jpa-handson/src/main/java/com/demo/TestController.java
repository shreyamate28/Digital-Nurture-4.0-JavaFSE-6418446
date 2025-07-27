package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/test-employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
