package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/dept/{dept}")
    public List<Employee> getByDepartment(@PathVariable String dept) {
        return service.getByDept(dept);
    }

    @GetMapping("/avg-salary")
    public BigDecimal getAverageSalary() {
        return service.getAvgSalary();
    }

    @GetMapping("/high-earners")
    public List<Employee> getHighEarners(@RequestParam double minSalary) {
        return service.highEarners(minSalary);
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }
}
