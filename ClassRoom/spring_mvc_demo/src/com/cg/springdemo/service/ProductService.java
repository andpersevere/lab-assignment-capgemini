package com.cg.springdemo.service;

import java.util.*;

import com.cg.springdemo.dto.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public List<Product> findAll();
	public Product findByProductId(Integer productId);
	public Product remove(Integer productId);
}
