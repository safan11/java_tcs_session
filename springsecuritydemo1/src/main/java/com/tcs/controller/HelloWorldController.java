package com.tcs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

	@GetMapping("/home")
	public ResponseEntity<String>  home()
	{
		String message="this is home page, public any one can access";
		
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	@GetMapping("/aboutus")
	public String aboutus()
	{
		return "this is about us, public any one can access";
	}
	
	@GetMapping("/addproduct")
	public String addproduct()
	{
		return "add product, accessed by only admin";
	}
	
	
	@GetMapping("/viewallproduct")
	public String viewallproduct()
	{
		return "access by both admin and answer";
	}
	
}
