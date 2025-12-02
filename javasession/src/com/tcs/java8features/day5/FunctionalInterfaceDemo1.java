package com.tcs.java8features.day5;

@FunctionalInterface
interface Greet
{
  void message();
}



public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {

		//using lamda expression, giving the implementation to functional interface.
		Greet greet = ()->System.out.println("welcome all");
		greet.message();
		
		
		Greet greet2 = ()->{
			  System.out.println("Thanks for listening");
			  System.out.println("we will go break");
		};
		
		greet2.message();
		
	}

}
