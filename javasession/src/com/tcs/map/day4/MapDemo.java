package com.tcs.map.day4;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "anil");
		hm.put(2, "suraj");
		hm.put(3, "manoj");
		hm.put(2, "rahul");
		hm.put(4, "anil");
		
		System.out.println(hm);
		
		//get all the keys: 
		System.out.println("get all the keys :"+hm.keySet());
		System.out.println("get all the values  :"+hm.values());
		System.out.println("get key and value :"+ hm.entrySet());

		// iterate using key
		for(Integer key: hm.keySet())
		{
			System.out.println(hm.get(key));
		}
		
		System.out.println("--------------------");
		
		
		HashMap<Integer, String> names = new HashMap<Integer, String>();
		names.putIfAbsent(1, "manoj");
		names.putIfAbsent(2, "sachin");
		names.putIfAbsent(1, "suraj");
		System.out.println(names);
		
		// get the elements using key
		System.out.println(names.get(1));
		
		
		
		
		
		

		
	
	}

}
