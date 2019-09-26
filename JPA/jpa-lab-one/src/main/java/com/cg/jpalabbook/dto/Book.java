package com.cg.jpalabbook.dto;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {

	@Id
	private BigInteger ISBN;
	@Column
	private String title;
	@Column
	private Double price;
	@ManyToMany(mappedBy = "bookList", cascade=CascadeType.ALL)
	private List<Author> authorList;

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + ", authorList=" + authorList + "]";
	}

	public Book(BigInteger iSBN, String title, Double price, List<Author> authorList) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.authorList = authorList;
	}

	public BigInteger getISBN() {
		return ISBN;
	}

	public void setISBN(BigInteger iSBN) {
		ISBN = iSBN;
	}

	public List<Author> getAuthorList() {
		return authorList;
	}

	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
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
