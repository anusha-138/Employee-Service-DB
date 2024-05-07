package com.org.db.employee.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private String employeeId;
	private String firstName;
	private String department;
	private String lastName;
	private String emailId;
	@JsonFormat(pattern="dd-mmm-yyyy",shape=Shape.STRING)
	private String dateOfJoining;
	private String location;

}
