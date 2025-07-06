package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getByDept(String dept) {
        return repository.findByDepartmentNative(dept);
    }

    public BigDecimal getAvgSalary() {
        return repository.getAverageSalary();
    }

    public List<Employee> highEarners(double minSalary) {
        return repository.findBySalaryGreaterThan(minSalary);
    }

    public List<Employee> getAll() {
        return repository.fetchAll();
    }
}
