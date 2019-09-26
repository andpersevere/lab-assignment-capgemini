package com.cg.springdemo.dao;

import java.util.List;

import com.cg.springdemo.dto.Product;

public interface ProductDao {
	public Product addProduct(Product product);
	public List<Product> showProduct();
}
