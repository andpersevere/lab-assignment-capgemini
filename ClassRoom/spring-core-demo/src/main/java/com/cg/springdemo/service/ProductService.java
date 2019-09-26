package com.cg.springdemo.service;

import java.util.List;

import com.cg.springdemo.dto.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public List<Product> showProduct();
}
