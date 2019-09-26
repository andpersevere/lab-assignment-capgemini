package com.cg.jpalabbook.service;

import com.cg.jpalabbook.dto.Author;

public interface AuthorService {

	public Author save(Author author);
	
	public Author find(Integer authorId);
	
	public Author update(Author author);
	
	public boolean remove(Integer authorId);
	
}
