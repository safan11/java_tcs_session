package com.tcs.service;

public class CalculationService {

	public int add(int a, int b)
	{
		return a+b;
	}
	
	public boolean checkEligiblity(int age)
	{
		if(age>=18)
			return true;
		return false;
	}
}
