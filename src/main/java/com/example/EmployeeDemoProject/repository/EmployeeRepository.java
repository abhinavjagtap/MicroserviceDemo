package com.example.EmployeeDemoProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.EmployeeDemoProject.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
