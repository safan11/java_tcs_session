package com.tcs.java8features.day5;

@FunctionalInterface
interface Greeting
{
	void message();
	
}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		Employee employee = new Employee();

	    // provide the implementation using lamda, 
		Greeting lamdaRef = ()-> System.out.println("welcome all");
		lamdaRef.message();
		
		//provide the implementation using method reference 
		Greeting methodRef = employee::fun1;
		methodRef.message();
		
	}

}
