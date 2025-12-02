package com.tcs;


public class Employee {
	
	int id;
	String name;
	
	
	public Employee() {
		super();
	
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public void setId(int id) {
		this.id = id;
	}

    public void setName(String name) {
		this.name = name;
	}

    
    
    
   void display()
	{
		System.out.println("employee display method");
		System.out.println("Id :"+ id);
		System.out.println("name :"+ name);
	}
}
