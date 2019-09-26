package com.cg.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springdemo.dao.ProductDao;

import com.cg.springdemo.dto.Product;

@Service("productservice")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDao productDao;
	
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	}

	public List<Product> showProduct() {
		return productDao.showProduct();
	}
	
}
