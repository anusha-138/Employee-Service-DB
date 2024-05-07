package com.org.db.employee.repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.org.db.employee.model.Employee;

@Repository
public class EmployeeRepository {
	
	private List<Employee> list = Arrays.asList(new Employee("CND28", "Eva", "Sales", "Mendes","Eva.Mendes@gmail.com","01-Oct-2020","Phillipines"),
            new Employee("CND29", "Sneha", "Sales", "Sengal","Sneha.Sengal@gmail.com","01-Oct-2020","Phillipines"),
            new Employee("CND30", "Ivan", "Sales", "Dougle","Ivan.Dougle@gmail.com","01-Oct-2020","Phillipines"),
            new Employee("CND31", "Pranay", "Operations", "Singh","Pranay.Singh@gmail.com","01-Oct-2020","Phillipines"),
            new Employee("CND32", "Davis", "Operations", "Frank","Davis.Frank@gmail.com","01-Apr-2020","Phillipines"),
            new Employee("CND33", "Jack", "Operations", "Oliver","Jack.Oliver@gmail.com","01-Aug-2020","Phillipines"),
            new Employee("CND34", "Rahul", "Operations", "Singh","Rahul.Singh@gmail.com","01-Sept-2020","Phillipines"),
            new Employee("CND35", "Kumar", "Testing", "Saurav","Kumar.Saurav@gmail.com","01-Dec-2020","Phillipines"),
            new Employee("CND36", "Ekta", "Testing", "Singh","Ekta.Singh@gmail.com","01-Oct-2020","Phillipines"),
            new Employee("CND37", "Janhavi", "Testing", "Kapoor","Janhavi.Kapoor@gmail.com","01-May-2020","Phillipines"),
            new Employee("CND38", "Thomas", "Developer", "Burger","Thomas.Burger@gmail.com","01-Oct-2020","Phillipines"),
            new Employee("CND39", "Lily", "Developer", "Lowry","Lily.Lowry@gmail.com","01-Feb-2020","Phillipines"),
            new Employee("CND40", "Mitchel", "Developer", "David","Mitchel.David@gmail.com","01-Mar-2020","Phillipines"),
            new Employee("CND41", "Martin", "Developer", "Patrick","Martin.Patrick@gmail.com","01-Jun-2020","Phillipines"),
            new Employee("CND42", "Jitendra", "Developer", "Kumar","Jitendra.Kumar@gmail.com","01-Jul-2020","Phillipines"),
            new Employee("CND43", "Ankit", "Developer", "Bhat","Ankit.Bhat@gmail.com","01-Nov-2020","Phillipines")
);


    public List<Employee> getAllEmployees() {
    	System.out.println(list);
        return list;
    }

    public Employee findById(String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmployeeId().equals(id)
            	) {
                return list.get(i);
            }
        }
        return null;
    }

    public List<Employee> search(String firstName) {
        return list.stream().filter(x -> x.getFirstName().toLowerCase().startsWith(firstName.toLowerCase())).collect(Collectors.toList());
    }
	
	

}
