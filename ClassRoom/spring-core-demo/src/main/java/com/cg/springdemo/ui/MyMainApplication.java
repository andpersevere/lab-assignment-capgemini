package com.cg.springdemo.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springdemo.dto.Product;
import com.cg.springdemo.service.ProductService;


public class MyMainApplication {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springcore.xml");
		ProductService productService = (ProductService) context.getBean("productservice");
		
		Product pro = (Product) context.getBean("product");
		pro.setProductId(100);
		pro.setProductName("Mobile");
		
		System.out.println(productService.addProduct(pro).toString());
		
	}
}
