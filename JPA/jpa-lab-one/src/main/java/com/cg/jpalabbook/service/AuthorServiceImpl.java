package com.cg.jpalabbook.service;

import com.cg.jpalabbook.dao.AuthorDao;
import com.cg.jpalabbook.dao.AuthorDaoImpl;
import com.cg.jpalabbook.dto.Author;

public class AuthorServiceImpl implements AuthorService {
	
	AuthorDao authorDao=new AuthorDaoImpl();
	
	public Author save(Author author) {
		return authorDao.save(author);
	}

	public Author find(Integer authorId) {
		return authorDao.find(authorId);
	}

	public Author update(Author author) {
		return authorDao.update(author);
	}

	public boolean remove(Integer authorId) {
		return authorDao.remove(authorId);
	}

}
