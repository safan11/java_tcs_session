package com.tcs.strings.day3;

public class WrapperClassDemo {

	public static void main(String[] args) {

		int a = 10; 
		System.out.println(a); // no behaviour // no methods 
		
		// behaviour --> methods --> person --> height, weight 
		
		Integer b=10;
		System.out.println(b);
		System.out.println(b.MIN_VALUE);
		System.out.println(b.MAX_VALUE);
		
		Integer c =a; // storing primitive into object (auto-boxing)
	}

}
