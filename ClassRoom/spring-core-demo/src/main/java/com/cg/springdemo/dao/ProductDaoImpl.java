package com.cg.springdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springdemo.dto.Product;

@Repository("productdao")
public class ProductDaoImpl implements ProductDao{
	
	List<Product> productList = new ArrayList<Product>();
	public Product addProduct(Product product) {
		productList.add(product);
		return product;
	}

	public List<Product> showProduct() {
		
		return productList;
	}

}
