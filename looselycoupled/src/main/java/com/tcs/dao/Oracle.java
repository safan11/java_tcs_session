package com.tcs.dao;

import org.springframework.stereotype.Component;

@Component
public class Oracle implements DBConnect {

	@Override
	public void databaseBrandName() {
	   System.out.println("connecting to oracle");
		
	}

}
