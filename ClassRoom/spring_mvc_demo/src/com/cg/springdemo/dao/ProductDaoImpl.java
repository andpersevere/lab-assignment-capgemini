package com.cg.springdemo.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springdemo.dto.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao{

	List<Product> productList=new ArrayList<Product>();
	
	
	public Product addProduct(Product product) {
		productList.add(product);
		return product;
	}

	
	public List<Product> findAll() {
		
		return productList;
	}

	
	public Product findByProductId(Integer productId) {
		Product foundPro;
		Iterator<Product> iterator = productList.iterator();
		while (iterator.hasNext()) {
			foundPro = (Product) iterator.next();
			if(foundPro.getProductId()==productId)
				return foundPro;
		}
		return null;
	}


	@Override
	public Product remove(Integer productId) {
		for (Product product:productList) {
			if(product.getProductId().equals(productId)) {
				productList.remove(product);
			}
		}
		return null;
	}
}
