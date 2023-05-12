package com.example.EmployeeDemoProject.serviceImpl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeDemoProject.entity.Employee;
import com.example.EmployeeDemoProject.repository.EmployeeRepository;
import com.example.EmployeeDemoProject.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public List<Employee> getEmpData() {
		List<Employee> emp = empRepo.findAll();
		return emp;
	}

	@Override
	public Employee insertEmpData(Employee emp) {
		Employee emp1 = empRepo.save(emp);
		return emp1;
	}

}
