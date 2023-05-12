package com.example.EmployeeDemoProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.EmployeeDemoProject.entity.Employee;
import com.example.EmployeeDemoProject.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@GetMapping("/employeeData")
	public List<Employee> getEmployee() {
       List<Employee> emp = empService.getEmpData();
       return emp;
	}
	
	@PostMapping("/insertEmployeeData")
	public Employee insertEmployee(@RequestBody Employee emp) {
	   Employee  msg = empService.insertEmpData(emp);
       return msg;
	}
	
	@GetMapping("/employeeDetails")
	public String getEmployeeDet() {
       String emp = "Hello";
       return emp;
	}

}
