package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.entity.Employee;

@Service
public interface EmployeeService {

	public List<Employee> getAllEmployee();
	
	public Employee saveEmployee(Employee employee);
}
