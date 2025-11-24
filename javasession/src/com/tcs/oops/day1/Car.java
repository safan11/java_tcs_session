package com.tcs.oops.day1;

public class Car {

	// attribute
	int kilometerDriven;
	int modelNo;
	String ownerName;
	
	
	//methods
	public void showDetails()
	{
		System.out.println("Kilometer Driven :"+ kilometerDriven);
		System.out.println("Model No :"+ modelNo);
		System.out.println("OwnerName :"+ ownerName);
	}
	
	//methods
	public String checkCarStatus()
	{
		if(kilometerDriven<=5000)
			return "car is New";
		else if(kilometerDriven >5000 && kilometerDriven <=20000)
			return "car is in good condition";
		
		return "car is old";
	}
	
	
}
