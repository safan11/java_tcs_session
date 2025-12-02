package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tcs.dao.DBConnect;

@Component
public class ProductService {

	@Autowired
	@Qualifier("mySql")
	DBConnect connect;
	
	public void display()
	{
		connect.databaseBrandName();
		System.out.println("this is service layer");
	}
	
}
