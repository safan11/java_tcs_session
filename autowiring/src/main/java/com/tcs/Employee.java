package com.tcs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	int id;
	String name;

	@Autowired
	@Qualifier("d1")  //It will decide which bean to qualify.
	Dept dept; // object type (we can inject using autowire)

	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("id :" + id);
		System.out.println("name :" + name);
		System.out.println("dept id :" + dept.id);
		System.out.println("dept name :" + dept.name);
		System.out.println("dept location :" + dept.location);

	}

}
