package com.tcs.day6.javanewfeatures;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo2 {

	public static void main(String[] args) {

	 LocalDate birthDate = LocalDate.of(1991, 11, 30);
	 Period period = Period.between(birthDate, LocalDate.now());
     System.out.println(period.getYears() +" years"+ period.getMonths() +" months"+ period.getDays()+" Days");
	  
     
	}

}
