package com.tcs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/home")
	public String homePage()
	{
		return "this is home page";
	}
	
	@GetMapping("/aboutus")
	public String aboutUsPage()
	{
		return "this is about us page";
	}
}
