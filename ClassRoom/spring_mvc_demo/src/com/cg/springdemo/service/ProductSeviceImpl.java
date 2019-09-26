package com.cg.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springdemo.dao.ProductDao;
import com.cg.springdemo.dto.Product;

@Service("productService")
public class ProductSeviceImpl implements ProductService{
	
	@Autowired
	ProductDao productDao;
	
	public Product addProduct(Product product) {
		
		return productDao.addProduct(product);
	}

	
	public List<Product> findAll() {
		
		return productDao.findAll();
	}

	
	public Product findByProductId(Integer productId) {
		
		return productDao.findByProductId(productId);
	}


	@Override
	public Product remove(Integer productId) {
		return productDao.remove(productId);
	}

}
