package com.cg.jdbc.lab2.service;

import java.math.BigInteger;

import com.cg.jdbc.lab2.dto.Author;

public interface IAuthorService {
	
	public boolean addAuthor(Author author);
	
	public boolean removeAuthor(Author author);
	
	public Author updateAuthor(Author author);
	
	public Author searchAuthor(BigInteger authorId);

}
