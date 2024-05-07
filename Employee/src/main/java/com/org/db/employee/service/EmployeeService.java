package com.org.db.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.db.employee.exception.EmployeeNotFoundException;
import com.org.db.employee.model.Employee;
import com.org.db.employee.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
    private EmployeeRepository repository;

    public List<Employee> searchEmployee(String firstName) {
    	if(null==repository.search(firstName)) throw new EmployeeNotFoundException("Sorry, no Employee found with the provided firstName :"+firstName);
        return repository.search(firstName);
    }

    public List<Employee> getEmployees() {
        return repository.getAllEmployees();
    }

    public Employee getEmployeeById(String id) {
    	if(null==repository.findById(id)) throw new EmployeeNotFoundException("Sorry, no employee found with the id :"+id);
        return repository.findById(id);
    }

}
