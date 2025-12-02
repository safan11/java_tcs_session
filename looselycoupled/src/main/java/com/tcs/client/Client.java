package com.tcs.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.service.ProductService;


public class Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.tcs");
        context.refresh();
        
  ProductService productService = (ProductService)context.getBean("productService");
	productService.display();
	
	
	}

}
