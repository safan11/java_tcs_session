package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.Employee;
import com.tcs.exception.IdNotFoundException;
import com.tcs.exception.InValidAgeException;
import com.tcs.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) throws InValidAgeException
	{
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployee();
	}
	
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) throws IdNotFoundException
	{
		return employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeById(@PathVariable int id) throws IdNotFoundException
	{
		return employeeService.deleteEmployeeById(id);
	}
	
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployeeById(@PathVariable int id,@RequestBody Employee employee)throws IdNotFoundException
	{
		return employeeService.updateEmployeeById(id, employee);
	}
	
	
	
}
