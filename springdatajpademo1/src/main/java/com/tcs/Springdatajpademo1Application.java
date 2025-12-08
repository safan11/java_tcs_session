package com.tcs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.entity.Employee;
import com.tcs.repository.EmployeeRepository;

@SpringBootApplication
public class Springdatajpademo1Application implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Springdatajpademo1Application.class, args);
	    System.out.println("database connected successfully");
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		//Employee employee = new Employee(2, "ankit", 55000.67, "developer", 32);
		//employeeRepository.save(employee);
		//System.out.println("inserted");
		
	List<Employee> employees   =employeeRepository.findAll();
    employees.forEach(System.out::println);	
    
    System.out.println("find by id");
    
  Employee emp=  employeeRepository.findById(1).orElseThrow(()->new ArithmeticException("no id found"));
		System.out.println(emp);
		
  		
	}

}
