package com.tcs.day7.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) {
 
		
		try 
		{
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class is found");
			
			//step-2  
	  Connection con=		DriverManager.getConnection("jdbc:mysql://localhost:3306/tcs", "root", "root");
			System.out.println("connected successfully");
		
		Statement statement =   con.createStatement();
		statement.execute("insert into employee values(1,'sachin','hr',30);");
		System.out.println("inserted ");
		
		
		 }
		catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
		
	}

}



