package com.sbmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sbmvc.model.Employee;

@Service
public interface EmployeeService {

	List<Employee> getEmployees();

	Employee addEmployee(Employee emp);
	
	

}
