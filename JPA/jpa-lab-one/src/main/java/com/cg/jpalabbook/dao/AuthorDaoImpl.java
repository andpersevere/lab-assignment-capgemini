package com.cg.jpalabbook.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.cg.jpalabbook.dto.Author;

public class AuthorDaoImpl implements AuthorDao{

	EntityManagerFactory emf=EntityManagerFactoryUtil.getEntityManagerFactory();
	EntityManager em=emf.createEntityManager();
	EntityTransaction transaction=em.getTransaction();
	
	public Author save(Author author) {
		transaction.begin();
		em.persist(author);
		transaction.commit();
		return author;
	}

	public Author find(Integer authorId) {
		return em.find(Author.class, authorId);
	}

	public Author update(Author updatedAuthor) {
		transaction.begin();
		Author author=em.find(Author.class, updatedAuthor.getAuthorId());
		author.setFirstName(updatedAuthor.getFirstName());
		author.setMiddleName(updatedAuthor.getMiddleName());
		author.setLastName(updatedAuthor.getLastName());
		author.setPhoneNumber(updatedAuthor.getPhoneNumber());
		transaction.commit();
		return author;
	}

	public boolean remove(Integer authorId) {
		transaction.begin();
		Author author=em.find(Author.class, authorId);
		em.remove(author);
		transaction.commit();
		return true;
	}

}
