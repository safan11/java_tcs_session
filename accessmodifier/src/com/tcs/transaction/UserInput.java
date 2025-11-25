package com.tcs.transaction;

import java.util.Scanner;

enum Status {
    AVAILABLE,
    BOOKED,
    CANCELLED
}

public class UserInput {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter status (AVAILABLE / BOOKED / CANCELLED): ");
	        String input = sc.next().toUpperCase(); // convert to match enum

	        Status status = Status.valueOf(input);

	        System.out.println("You entered: " + status);
	}
}
