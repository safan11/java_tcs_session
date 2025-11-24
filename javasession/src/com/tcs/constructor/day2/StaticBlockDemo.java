package com.tcs.constructor.day2;

public class StaticBlockDemo {

	static
	{
		System.out.println("static block 1 called ");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
	}
	
	static 
	{
		System.out.println("static block 2 called");
	}
}
