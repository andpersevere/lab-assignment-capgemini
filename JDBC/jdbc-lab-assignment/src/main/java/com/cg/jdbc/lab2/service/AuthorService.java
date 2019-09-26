/**
 * 
 */
package com.cg.jdbc.lab2.service;

import java.math.BigInteger;

import com.cg.jdbc.lab2.dao.AuthorDao;
import com.cg.jdbc.lab2.dao.IAuthorDao;
import com.cg.jdbc.lab2.dto.Author;

/**
 * @author admin1
 *
 */
public class AuthorService implements IAuthorService {

	/* (non-Javadoc)
	 * @see com.cg.jdbc.lab2.service.IAuthorService#addAuthor(com.cg.jdbc.lab2.dto.Author)
	 */
	
	IAuthorDao authorDao = new AuthorDao();
	
	public boolean addAuthor(Author author) {
		return authorDao.addAuthor(author);
	}

	/* (non-Javadoc)
	 * @see com.cg.jdbc.lab2.service.IAuthorService#removeAuthor(com.cg.jdbc.lab2.dto.Author)
	 */
	public boolean removeAuthor(Author author) {
		return authorDao.removeAuthor(author);
	}

	/* (non-Javadoc)
	 * @see com.cg.jdbc.lab2.service.IAuthorService#updateAuthor(com.cg.jdbc.lab2.dto.Author)
	 */
	public Author updateAuthor(Author author) {
		return authorDao.updateAuthor(author);
	}

	/* (non-Javadoc)
	 * @see com.cg.jdbc.lab2.service.IAuthorService#searchAuthor(java.math.BigInteger)
	 */
	public Author searchAuthor(BigInteger authorId) {
		return authorDao.searchAuthor(authorId);
	}

}
