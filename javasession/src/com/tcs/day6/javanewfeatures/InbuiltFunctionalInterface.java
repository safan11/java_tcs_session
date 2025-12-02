package com.tcs.day6.javanewfeatures;

import java.util.function.Predicate;

public class InbuiltFunctionalInterface {

	public static void main(String[] args) {

		Predicate<Integer> checkAge = (age)->age>18;
		
		System.out.println(checkAge.test(23));
		System.out.println(checkAge.test(17));
		
		
		
	}

}
