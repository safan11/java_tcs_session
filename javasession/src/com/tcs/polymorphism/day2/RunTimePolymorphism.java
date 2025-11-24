package com.tcs.polymorphism.day2;

class Bank
{
     void dailyLimit()
     {
    	 System.out.println("1 lakh");
     }
     
     void loan()
     {
    	 System.out.println("all customer above 750 credit score will get loan");
     }
}

class Gpay extends Bank 
{
	@Override
	void dailyLimit()
    {
   	 System.out.println("2 lakh");
    }
	
	
	
}




public class RunTimePolymorphism {

	public static void main(String[] args) {
		
	//	Gpay gpay  = new Gpay(); // It will call both the parent and child methods
	//	gpay.doPayment();
	//	gpay.loan();
		
		
		Bank bank = new Gpay();//upcasting , It will call on
		bank.dailyLimit();
		bank.loan();
	
	
	
	}
}
