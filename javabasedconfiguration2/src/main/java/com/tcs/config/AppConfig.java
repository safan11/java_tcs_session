package com.tcs.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.tcs.Employee;

@Configurable    // It indicates it is a configuration file, where we can define beans configuration
public class AppConfig {

	@Bean("e1")
	@Scope("prototype")   // deafult scope is singleton
	public Employee createEmployeeBean1()
	{
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("anil");
		return employee;
	}
	
	
	@Bean("e2")
	public Employee createEmployeeBean2()
	{
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("sourab");
		return employee;
	}
	
	
	//injecting using constructor
	@Bean("e3")
	public Employee createEmployeeBean3()
	{
		return new Employee(3, "ankit");
	}
	
}
