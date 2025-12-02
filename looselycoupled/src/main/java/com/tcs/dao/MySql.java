package com.tcs.dao;

import org.springframework.stereotype.Component;

@Component
public class MySql implements DBConnect {

	@Override
	public void databaseBrandName() {
	    
		System.out.println("connected with MySql database");
		System.out.println("fetch the data from mysql");

	}

}
