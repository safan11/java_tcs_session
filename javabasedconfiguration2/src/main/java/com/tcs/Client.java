package com.tcs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.config.AppConfig;

public class Client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context 
		    = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
	Employee employee1 = (Employee)context.getBean("e1");
	//employee1.display();
	System.out.println(employee1.hashCode());
	
	
	Employee employee2 = (Employee)context.getBean("e1");
	//employee2.display();
	System.out.println(employee2.hashCode());
	
	
	}

}
