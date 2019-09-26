package com.cg.jdbc.dto;

import java.math.BigInteger;

public class Book {

	private BigInteger ISBN;
	private String title;
	private Double price;
	
	public Book() {
		super();
	}
	
	public Book(BigInteger iSBN, String title, Double price) {
		ISBN = iSBN;
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + "]";
	}
	
	public BigInteger getISBN() {
		return ISBN;
	}
	
	public void setISBN(BigInteger iSBN) {
		ISBN = iSBN;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}

}
