package com.tcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		//IOC container -->reponsible to manage the objects
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//It will get the bean from the container,
		Employee employee1 =(Employee)   context.getBean("e");
		employee1.displayInfo();
		System.out.println("employee 1 hascode :"+ employee1.hashCode());
		
		Employee employee2 =(Employee)   context.getBean("e");
		employee2.displayInfo();
		System.out.println("employee 2 hascode :"+ employee2.hashCode());


		
		
	}

}
