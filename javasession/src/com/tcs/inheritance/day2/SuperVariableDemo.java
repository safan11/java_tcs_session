package com.tcs.inheritance.day2;

class Parent2
{
	int a=1;
}

class Child2 extends Parent2
{
	int a=2;
	
	void display()
	{
		int a=3;
		
		System.out.println("value of a from parent class :"+ super.a);
		System.out.println("value of a from child class global variable :"+ this.a);
		System.out.println("value of a from child class local variable :"+ a);


	}
}





public class SuperVariableDemo {

	public static void main(String[] args) {
		
		Child2 child2 = new Child2();
		child2.display();
	}
}
