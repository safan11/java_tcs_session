package com.tcs.basic.day1;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("start :"+ i);
			
			if(i==5)
				//break;
				 continue;
			
			System.out.println("end :"+ i);
		}
		
	}
}
