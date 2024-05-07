package com.org.db.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.org.db.employee.model.Employee;
import com.org.db.employee.service.IEmployeeService;

import lombok.RequiredArgsConstructor;

@CrossOrigin("http://localhost:3000") // allowing client application to consume the backed
@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;

	@GetMapping
	public ResponseEntity<List<Employee>> getEmployees() {
		return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable String id) {
		return new ResponseEntity<>(employeeService.getEmployeeById(id),HttpStatus.OK);

	}
	@GetMapping("/search/{firstName}")
	public ResponseEntity<List<Employee>> searchEmployees(@PathVariable String firstName) {
		return new ResponseEntity<>(employeeService.searchEmployee(firstName), HttpStatus.FOUND);
	}
}
