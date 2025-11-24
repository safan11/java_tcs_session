package com.tcs.arraylist.day3;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList obj = new ArrayList();
		
		System.out.println("before adding size :"+ obj.size());
		obj.add(1);
		obj.add("sunil");
		obj.add(true);
		
		System.out.println("after adding size is :"+ obj.size());
		
		System.out.println("elements are :"+ obj);
		
		
		
		
		
	}

}
