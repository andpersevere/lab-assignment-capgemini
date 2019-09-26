package com.cg.jdbc.lab2.dao;

import java.math.BigInteger;

import com.cg.jdbc.lab2.dto.Author;

public interface IAuthorDao {

public boolean addAuthor(Author author);
	
	public boolean removeAuthor(Author author);
	
	public Author updateAuthor(Author author);
	
	public Author searchAuthor(BigInteger authorId);
	
}
