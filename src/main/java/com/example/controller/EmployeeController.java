package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	//save operation
	
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		Employee emp = employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(emp);
		
	}

}
