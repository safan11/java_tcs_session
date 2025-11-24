package com.tcs.interfacedemo.day2;

interface Bank
{
	 int minimumBalance=5000;
	 
	 void accountHolderName();
	
}

interface Transcation extends Bank
{
	void withdraw();
}

class Customer implements Transcation
{

	@Override
	public void accountHolderName() {
		 System.out.println("anil");
	}

	@Override
	public void withdraw() {
		System.out.println("iam doing withdraw");
		
	}
	
}






public class InterfaceDemo1 {

	public static void main(String[] args) {
		
		
	}
}
