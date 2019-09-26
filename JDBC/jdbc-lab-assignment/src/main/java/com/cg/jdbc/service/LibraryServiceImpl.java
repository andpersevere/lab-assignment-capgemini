package com.cg.jdbc.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.jdbc.dao.LibraryDao;
import com.cg.jdbc.dao.LibraryDaoImpl;
import com.cg.jdbc.dto.Author;
import com.cg.jdbc.dto.Book;

public class LibraryServiceImpl implements LibraryService {

	LibraryDao libraryDao=new LibraryDaoImpl();
	
	public Author addAuthor(Author author) {
		return libraryDao.addAuthor(author);
	}

	public Author updateAuthor(Author author) {
		return libraryDao.updateAuthor(author);
	}

	public Author findAuthor(BigInteger authorId) {
		return libraryDao.findAuthor(authorId);
	}

	public boolean deleteAuthor(BigInteger authorId) {
		return libraryDao.deleteAuthor(authorId);
	}

	@Override
	public List<Book> findBook(BigInteger authorId) {
		return libraryDao.findBook(authorId);
	}

	@Override
	public boolean addBookAndAuthor(Book book, Author author) {
		return libraryDao.addBookAndAuthor(book, author);
	}

	@Override
	public boolean updateBookPrice(String authorName, Double price) {
		return libraryDao.updateBookPrice(authorName, price);
	}

}
