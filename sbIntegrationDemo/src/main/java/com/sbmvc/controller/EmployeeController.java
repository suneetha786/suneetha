package com.sbmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbmvc.model.Employee;
import com.sbmvc.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping(path="/getEmp",method=RequestMethod.GET)
	public List<Employee> getEmployees(){
		List<Employee> empList=service.getEmployees();
		return empList;
	}
	
	@PostMapping(value="/addEmp")
	public Employee addEmployee(@RequestBody Employee emp) {
		Employee employee=service.addEmployee(emp);
		return employee;
	}
	
}
