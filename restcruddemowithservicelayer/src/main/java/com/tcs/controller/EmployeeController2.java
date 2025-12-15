package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.Employee;
import com.tcs.exception.InValidAgeException;
import com.tcs.service.EmployeeService;

@RestController
@RequestMapping("/api/v2")
public class EmployeeController2 {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) throws InValidAgeException
	{
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee), HttpStatus.OK);
	}
	
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> viewAllEmployee()
	{
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployee(), HttpStatus.OK);
	}
	
}
