package com.tcs.repository;

import org.springframework.stereotype.Component;

@Component
public class Python implements Course {

	@Override
	public String getCourseName() {
		// TODO Auto-generated method stub
		return "python";
	}

	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return 20;
	}

}
