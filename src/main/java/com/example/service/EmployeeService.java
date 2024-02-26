package com.example.service;

import org.springframework.stereotype.Service;

import com.example.Entity.Employee;

@Service
public interface EmployeeService {
	
	//save operation
	public Employee saveEmployee(Employee employee);

}
