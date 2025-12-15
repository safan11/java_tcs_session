package com.tcs.service;

import java.util.List;

import com.tcs.entity.Employee;
import com.tcs.exception.IdNotFoundException;
import com.tcs.exception.InValidAgeException;

public interface EmployeeService {

	 public Employee addEmployee(Employee employee) throws InValidAgeException;
	 public List<Employee> getAllEmployee();
	 public Employee getEmployeeById(int id) throws IdNotFoundException;
	 public String deleteEmployeeById(int id) throws IdNotFoundException;
	 public Employee updateEmployeeById(int id, Employee employee) throws IdNotFoundException;
	 public Employee findByName(String name);
	 public List<Employee> findByDept(String dept);
	 public List<Employee> findByDeptUsingJpql(String dept);
	 public List<Employee> getEmployeeByAgeLessThan(int age);
	 
}
