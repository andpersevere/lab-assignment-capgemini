package com.cg.jdbc.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.jdbc.dto.Author;
import com.cg.jdbc.dto.Book;

public interface LibraryService {

	public Author addAuthor(Author author);
	public Author updateAuthor(Author author);
	public Author findAuthor(BigInteger authorId);
	public boolean deleteAuthor(BigInteger authorId);
	public List<Book> findBook(BigInteger authorId);
	public boolean addBookAndAuthor(Book book, Author author);
	public boolean updateBookPrice(String authorName, Double price);
	
}
