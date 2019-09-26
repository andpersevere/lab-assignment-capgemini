package com.cg.jpalabbook.dao;

import com.cg.jpalabbook.dto.Author;

public interface AuthorDao {

	public Author save(Author author);
	
	public Author find(Integer authorId);
	
	public Author update(Author author);
	
	public boolean remove(Integer authorId);
	
}
