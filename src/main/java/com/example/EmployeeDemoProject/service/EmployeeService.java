package com.example.EmployeeDemoProject.service;

import java.util.*;
import com.example.EmployeeDemoProject.entity.Employee;

public interface EmployeeService {

	public List<Employee> getEmpData();

	public Employee  insertEmpData(Employee emp);

}
