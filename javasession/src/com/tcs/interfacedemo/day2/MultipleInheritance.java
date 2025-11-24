package com.tcs.interfacedemo.day2;

interface Parent1
{
	void fatherName1();
}


interface Parent2 
{
	 void fatherName2();
}

class Child implements Parent1,Parent2 
{

	@Override
	public void fatherName2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fatherName1() {
		// TODO Auto-generated method stub
		
	}

	
	
}

public class MultipleInheritance {

	public static void main(String[] args) {

	}

}
