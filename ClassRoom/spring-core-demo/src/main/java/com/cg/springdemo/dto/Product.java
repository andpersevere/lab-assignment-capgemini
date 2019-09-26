package com.cg.springdemo.dto;

import org.springframework.stereotype.Component;

@Component("product")
public class Product {
	
	private Integer productId;
	private String productName;
	
	
	
	public Product() {
		super();
	}
	
	public Product(Integer productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
	 
	
}
