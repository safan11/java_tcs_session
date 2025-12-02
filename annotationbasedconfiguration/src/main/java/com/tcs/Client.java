package com.tcs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.tcs");
		context.refresh();
		
	Employee employee = (Employee)context.getBean("e");
	employee.display();
	}

}
