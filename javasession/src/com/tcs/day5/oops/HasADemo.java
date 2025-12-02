package com.tcs.day5.oops;

class Address 
{
	int doorNo;
	String streetName;
	String city;
	public Address(int doorNo, String streetName, String city) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
	}
	
	
	
}

class Employee
{
	int id;
	String name;
	int age;
	Address address;  // object reference // has a.
	public Employee(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void display()
	{
		System.out.println("id :"+ id);
		System.out.println("name :"+ name);
		System.out.println("age :"+ age);
		System.out.println("doorno :"+ address.doorNo);
		System.out.println("street name :" + address.streetName);
		System.out.println("city :"+ address.city);
	}
	
}




public class HasADemo {

	public static void main(String[] args) {

		Employee employee = new Employee(1, "anil", 23, new Address(1001, "btm", "bangalore"));
		employee.display();
	
		System.out.println("-----");
		
		Address addr = new Address(2001, "whitefield", "bangalore");
		Employee employee2 = new Employee(2, "sourab", 25, addr);
		employee2.display();
	
		System.out.println("-----");
	
		  new Employee(3, "mahesh", 27, addr).display();
	}

}
