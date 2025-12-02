package com.tcs.day6.javanewfeatures;

import java.util.ArrayList;
import java.util.Comparator;


class Employee
{
	int id;
	String name;
	int age;
	
	Employee(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}


public class StreamSorting {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "sunil", 34)); // 
		employees.add(new Employee(2, "ramesh", 25));
		employees.add(new Employee(3, "mahesh", 36));
		employees.add(new Employee(4, "manas", 25));

		
		System.out.println("--print all the employees---");
		employees.stream().forEach(e->System.out.println(e));
		
		System.out.println("--display employee age > 30---");
		employees.stream()
		          .filter(e->e.getAge()>30)
		          .forEach(e->System.out.println(e));
		
		
		System.out.println("----sorted in ascending order--");
		
		employees
		   .stream() 
		   .sorted(Comparator.comparingInt(Employee::getAge))
		   .forEach(System.out::println);
		
		
       System.out.println("----sorted in descending order--");
		
		employees
		   .stream() 
		   .sorted(Comparator.comparingInt(Employee::getAge).reversed())
		   .forEach(System.out::println);
		
		
          System.out.println("----sorted in ascending order with age, and then by name--");
		
		   employees
		   .stream() 
		   .sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Comparator.comparing(Employee::getName)))
		   .forEach(System.out::println);
			
		   
		   System.out.println("employee name is upper case");
		   employees
		       .stream()
		       .map(e-> e.getId() +" "+ e.getName().toUpperCase() +" "+e.getAge())
		       .forEach(System.out::println);
		       
		
	}

}
