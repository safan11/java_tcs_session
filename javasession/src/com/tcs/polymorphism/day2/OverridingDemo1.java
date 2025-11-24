package com.tcs.polymorphism.day2;

class Parent
{
	void breakfast()
	{
		System.out.println("idly");
	}
	
	void packetMoney()
	{
		System.out.println("2000 rs");
	}
}

class Child extends Parent 
{
	@Override
	void breakfast()
	{
		System.out.println("dosa");
	}
	
	
}


public class OverridingDemo1 {

	public static void main(String[] args) {

		Child child = new Child();
		child.breakfast();
		child.packetMoney();
		
		
		
	}

}
