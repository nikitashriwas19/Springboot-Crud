package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Employee;
import com.example.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepositorty;

	//To save employee
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepositorty.save(employee);
	}

}
