package com.sbmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbmvc.dao.EmployeeRepo;
import com.sbmvc.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public List<Employee> getEmployees() {
	List<Employee> empList=repo.findAll();
		return empList;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		Employee employee=repo.save(emp);
		return employee;
	}

}
