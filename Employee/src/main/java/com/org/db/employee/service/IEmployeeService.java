package com.org.db.employee.service;

import java.util.List;

import com.org.db.employee.model.Employee;

public interface IEmployeeService {
	
	List<Employee> searchEmployee(String firstName);
	List<Employee> getEmployees();
	Employee getEmployeeById(String id);
}
