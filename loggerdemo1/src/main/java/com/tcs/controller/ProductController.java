package com.tcs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	
  Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@GetMapping("/home")
	public String home()
	{
		//System.out.println("---called home controller-----");
		logger.info("this is info message , inside home");
		logger.debug("this is debug message ");
		logger.warn("this is warn message");
		logger.error("this is error message");
		
		return "this is home";
    }
	
	
	@GetMapping("/aboutus")
	public String aboutUs()
	{
		
         return "this is about us";
	}

}
