package com.tcs.basic.day1;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int arr[]= new int[5];
		
		System.out.println("length :"+arr.length);
		
		arr[1]=10;
		arr[2]=20;
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		System.out.println("----------------");
		
		for(int a:arr)
			System.out.println(a);
		
		
	}
}
