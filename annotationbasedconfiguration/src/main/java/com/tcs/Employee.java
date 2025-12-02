package com.tcs;

import org.springframework.stereotype.Component;

@Component("e")  // It will configure the bean as employee
public class Employee {

	void display()
	{
		System.out.println("employee display method");
	}
}
