package com.tcs.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.tcs.Employee;

@Configurable    // It indicates it is a configuration file, where we can define beans configuration
public class AppConfig {

	@Bean("e")
	public Employee createEmployeeBean()
	{
		return new Employee();
	}
	
}
