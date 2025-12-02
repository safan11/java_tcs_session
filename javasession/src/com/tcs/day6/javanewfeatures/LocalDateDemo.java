package com.tcs.day6.javanewfeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateDemo {

	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		
		
		LocalDate today = LocalDate.now();
		System.out.println("Week Day :"+today.getDayOfWeek());
		System.out.println("Day of the month :"+today.getDayOfMonth());
		System.out.println("Day of the Year :"+today.getDayOfYear());
		System.out.println("Year :"+today.getYear());
		
	    LocalDate bookingDate=	LocalDate.of(2025, 11, 27);
	    System.out.println("Booking Date :"+bookingDate);
	    
	    if(bookingDate.isAfter(today))
	    	System.out.println("valid booking date");
	    else 
	    	System.out.println("booking cannot be previous date");
	}

}
