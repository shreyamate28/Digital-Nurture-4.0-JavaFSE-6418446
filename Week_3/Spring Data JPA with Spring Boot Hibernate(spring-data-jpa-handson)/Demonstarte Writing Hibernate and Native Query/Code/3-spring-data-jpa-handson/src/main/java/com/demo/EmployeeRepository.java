package com.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Native query for employees by department
    @Query(value = "SELECT * FROM employee WHERE department = ?1", nativeQuery = true)
    List<Employee> findByDepartmentNative(String dept);

    // Native query for average salary
    @Query(value = "SELECT AVG(salary) FROM employee", nativeQuery = true)
    BigDecimal getAverageSalary();

    // HQL query for employees with salary > minSalary
    @Query("SELECT e FROM Employee e WHERE e.salary > :minSalary")
    List<Employee> findBySalaryGreaterThan(double minSalary);

    // HQL query to fetch all employees (optional, JpaRepository has findAll())
    @Query("SELECT e FROM Employee e")
    List<Employee> fetchAll();
}
