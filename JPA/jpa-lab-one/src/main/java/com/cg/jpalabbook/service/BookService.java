package com.cg.jpalabbook.service;

import java.math.BigInteger;

import com.cg.jpalabbook.dto.Book;

public interface BookService {
	
	public Book save(Book book);
	
	public Book find(BigInteger ISBN);
	
	public Book update(Book book);
	
	public boolean remove(BigInteger ISBN);
	
}
