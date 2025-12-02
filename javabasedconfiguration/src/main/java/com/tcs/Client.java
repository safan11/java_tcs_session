package com.tcs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.config.AppConfig;

public class Client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context 
		    = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
	Employee employee = (Employee)context.getBean("e");
	employee.display();
	
	
	
	
	}

}
