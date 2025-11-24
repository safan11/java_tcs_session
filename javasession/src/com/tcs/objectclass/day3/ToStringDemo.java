package com.tcs.objectclass.day3;

import java.util.Objects;

class Employee
{
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
}





public class ToStringDemo {

	public static void main(String[] args) {

		int a=10;
		Employee employee = new Employee(1, "sachin");
		//System.out.println("value of a :"+ a);
		//System.out.println("value of employee :"+ employee);
		
		Employee employee2 = new Employee(1, "sachin");
		
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		
		
		
		
	
		
	}

}
