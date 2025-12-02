package com.tcs.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.tcs.Dept;
import com.tcs.Employee;

@Configuration    // It indicates it is a configuration file, where we can define beans configuration
public class AppConfig {

	//@Primary
	@Bean("d1")
	public Dept dept1()
	{
		return new Dept(1001, "testing", "RMZ");
	}
	
	
	@Bean("d2")
	public Dept dept2()
	{
		return new Dept(1002, "developer", "brigade");
	}
	
	
	
	
	// we are passing id and name using constrcutor, and Dept will inject using autowire.
	@Bean("e1")
	public Employee employee()
	{
		return new Employee(1, "anil");
	}
	
}
