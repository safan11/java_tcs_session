package com.tcs.list.day4;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();
		names.add("anil");
		names.add("sourab");
		names.addFirst("mahesh");
		names.addLast("ankit");
		names.add("sachin");
		
		System.out.println(names);
		
	}

}
