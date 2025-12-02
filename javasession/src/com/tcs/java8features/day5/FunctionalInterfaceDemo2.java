package com.tcs.java8features.day5;

interface Calculator 
{
	int operation(int a,int b);
}


public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {

		Calculator add = (a,b)->a+b;   // implementation --> stored in add ref
		System.out.println("Addition :"+add.operation(2, 5));

		System.out.println("----------------------");
		
		Calculator findLarge = (a,b)-> {      // implementation --> stored in findLarge 
			if(a>b)
				return a;
			return b;
		};
		
		System.out.println("Large :"+findLarge.operation(3, 5));
	}

}
