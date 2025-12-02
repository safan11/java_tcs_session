package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tcs.repository.Course;

@Component
public class Enroll {

	//write these logic
    public int calculateFee(boolean memeberShip,Course course)
	{
		int amount=0;
		     System.out.println("you have selected :"+ course.getCourseName());
		     System.out.println("duration :"+ course.getDuration());
		
		return amount;
		
	}
}
