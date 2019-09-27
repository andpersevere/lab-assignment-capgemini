package com.cg.springdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springdemo.dto.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao{
	
	@PersistenceContext
	EntityManager manager;
	
	@Override
	public Product addProduct(Product product) {
		manager.persist(product);
		return product;
	}

	@Override
	public List<Product> findAll() {
		Query query=manager.createQuery("FROM Product");
		List<Product> productList =  query.getResultList();
		return productList;
	}

	@Override
	public Product findByProductId(Integer productId) {
		Product product=manager.find(Product.class, productId);
		return product;
	}

	@Override
	public Product remove(Integer productId) {
		Product product=manager.find(Product.class, productId);
		
		if(product!=null) {
			manager.remove(product);
			System.out.println("Admin has been removed");
		}
		
		return product;
	}

	
}
