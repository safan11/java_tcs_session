package com.tcs.day6.javanewfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) {

	   List<Integer> nums =	Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
	   // traditional way
	   for(Integer num: nums)
	   {
		   if(num%2==0)
		   {
			   System.out.println(num);
		   }
		      
	   }
	   
	   
	   System.out.println("---using stream---");
	   // using stream
	   nums.stream()
	       .filter((n)->n%2==0)   // 2,4,6,8,10
	       .forEach(s->System.out.println(s));
	   
	   
	   // count of even number 
	   long count= nums.stream()
	        .filter(n->n%2==0)
	        .count();
	  System.out.println("count of even :"+ count);  
	 
	   
	  System.out.println("-----square--");
	  // square of number
	   nums.stream()
	     .map(n->n +" "+  (n*n))
	     .forEach(s->System.out.println(s));
		
	  
	   System.out.println("--sorted---");
	   
	   nums
	     .stream()
	     .sorted()
	     .forEach(System.out::println);
	   
	   System.out.println("reverse order");
	   
	   
	   
	   
	   
	   
	}

}
