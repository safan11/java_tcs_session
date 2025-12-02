package com.tcs.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.repository.Course;
import com.tcs.repository.Java;
import com.tcs.repository.Python;
import com.tcs.service.Enroll;

public class Client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.tcs");
		context.refresh();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter course name");
		String userInputCourse=scanner.nextLine();
		
		Course course=null;
		
		if(userInputCourse.equalsIgnoreCase("java"))
		{
		     course = (Course)	context.getBean("java");
		}
		
		else if(userInputCourse.equalsIgnoreCase("python"))
		{
			course = (Course) context.getBean("python");
		}
		
	    Enroll enroll = (Enroll)	context.getBean("enroll");
	 
	    enroll.calculateFee(false,course );
	}

}
