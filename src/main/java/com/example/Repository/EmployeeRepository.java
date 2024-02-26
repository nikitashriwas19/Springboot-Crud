package com.example.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
