package com.tcs.exception.day3;

class InValidAgeException extends Exception 
{
	public InValidAgeException(String msg) {
		super(msg);
		
	}
	
	
	
}
class Customer 
{
	public void validateAge(int age) throws InValidAgeException
	{
		if(age<18)
			throw new InValidAgeException("age is less");
		else
			System.out.println("eligible ");
	}
}



public class ThrowDemo {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		System.out.println("welcome to our app");
		try
		{
			customer.validateAge(2);
		}
		catch (InValidAgeException e) {
			System.out.println(e.getMessage());
		
		}
		
	}

}
