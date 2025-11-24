package com.tcs.strings.day3;

public class StringDemo1 {

	public static void main(String[] args) {
		
		char ch=65;
		System.out.println(ch);
		
		String name="sachin";
		System.out.println(name);
		System.out.println(name.concat(" kumar"));
		System.out.println(name);
		
		name.concat(" tendulkar"); //  we cannot modify
		System.out.println(name);
		
		name=name.concat(" ramesh"); //we can assign it
		System.out.println(name);
		
		
		
	}
}
