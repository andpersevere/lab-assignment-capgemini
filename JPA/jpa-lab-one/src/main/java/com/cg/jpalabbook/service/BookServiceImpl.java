package com.cg.jpalabbook.service;

import java.math.BigInteger;

import com.cg.jpalabbook.dao.BookDao;
import com.cg.jpalabbook.dao.BookDaoImpl;
import com.cg.jpalabbook.dto.Book;

public class BookServiceImpl implements BookService {

	BookDao bookDao=new BookDaoImpl();

	public Book save(Book book) {
		return bookDao.save(book);
	}

	public Book find(BigInteger ISBN) {
		return bookDao.find(ISBN);
	}

	public Book update(Book book) {
		return bookDao.update(book);
	}

	public boolean remove(BigInteger ISBN) {
		return bookDao.remove(ISBN);
	}

}
