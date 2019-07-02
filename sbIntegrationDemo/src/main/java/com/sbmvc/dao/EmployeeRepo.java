package com.sbmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbmvc.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
