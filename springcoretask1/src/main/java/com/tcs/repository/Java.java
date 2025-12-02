package com.tcs.repository;

import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

	@Override
	public String getCourseName() {
		// TODO Auto-generated method stub
		return "java";
	}

	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return 30;
	}

}
