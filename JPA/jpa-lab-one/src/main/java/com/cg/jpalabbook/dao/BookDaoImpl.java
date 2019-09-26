package com.cg.jpalabbook.dao;

import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.cg.jpalabbook.dto.Book;

public class BookDaoImpl implements BookDao {

	EntityManagerFactory emf=EntityManagerFactoryUtil.getEntityManagerFactory();
	EntityManager em=emf.createEntityManager();
	EntityTransaction transaction=em.getTransaction();
	
	public Book save(Book book) {
		transaction.begin();
		em.persist(book);
		transaction.commit();
		return book;
	}

	public Book find(BigInteger iSBN) {
		return em.find(Book.class, iSBN);
	}

	public Book update(Book updatedBook) {
		transaction.begin();
		Book book=em.find(Book.class, updatedBook.getISBN());
		book.setTitle(updatedBook.getTitle());
		book.setPrice(updatedBook.getPrice());
		transaction.commit();
		return book;
	}

	public boolean remove(BigInteger ISBN) {
		transaction.begin();
		Book book=em.find(Book.class, ISBN);
		em.remove(book);
		transaction.commit();
		return true;
	}

}
