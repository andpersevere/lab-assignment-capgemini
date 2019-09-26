package com.cg.jpalabbook.ui;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.jpalabbook.dto.Author;
import com.cg.jpalabbook.dto.Book;
import com.cg.jpalabbook.service.AuthorService;
import com.cg.jpalabbook.service.AuthorServiceImpl;
import com.cg.jpalabbook.service.BookService;
import com.cg.jpalabbook.service.BookServiceImpl;

public class Application {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		AuthorService authorService=new AuthorServiceImpl();
		BookService bookService=new BookServiceImpl();
		int choice=0;
		do {
			System.out.println("Enter 1 to Add an Author.");
			System.out.println("Enter 2 to Find an Author.");
			System.out.println("Enter 3 to Update an Author.");
			System.out.println("Enter 4 to Remove an Author.");
			System.out.println("Enter 5 to Add a Book.");
			System.out.println("Enter 6 to Find a Book.");
			System.out.println("Enter 7 to Update a Book.");
			System.out.println("Enter 8 to Remove a Book.");
			System.out.println("Enter 0 to Exit.");
			choice=scanner.nextInt();
			switch(choice) {
				case 1:{
					System.out.print("Enter First Name: ");
					String fName=scanner.next();
					System.out.print("Enter Middle Name: ");
					String mName=scanner.next();
					System.out.print("Enter Last Name: ");
					String lName=scanner.next();
					System.out.print("Enter Phone Number: ");
					BigInteger phone=scanner.nextBigInteger();
					Author author=new Author();
					author.setFirstName(fName);
					author.setMiddleName(mName);
					author.setLastName(lName);
					author.setPhoneNumber(phone);
					authorService.save(author);
					break;
				}case 2:{
					System.out.print("Enter author Id: ");
					Integer authorId=scanner.nextInt();
					System.out.println(authorService.find(authorId));
					break;
				}case 3:{
					System.out.print("Enter author Id: ");
					Integer authorId=scanner.nextInt();
					System.out.print("Enter First Name: ");
					String fName=scanner.next();
					System.out.print("Enter Middle Name: ");
					String mName=scanner.next();
					System.out.print("Enter Last Name: ");
					String lName=scanner.next();
					System.out.print("Enter Phone Number: ");
					BigInteger phone=scanner.nextBigInteger();
					Author author=new Author();
					author.setAuthorId(authorId);
					author.setFirstName(fName);
					author.setMiddleName(mName);
					author.setLastName(lName);
					author.setPhoneNumber(phone);
					authorService.update(author);
					break;
				}case 4:{
					System.out.print("Enter author Id: ");
					Integer authorId=scanner.nextInt();
					System.out.print(authorService.remove(authorId));
					break;
				}case 5:{
					System.out.println("Enter Book ISBN: ");
					BigInteger ISBN=scanner.nextBigInteger();
					scanner.nextLine();
					System.out.print("Enter Book Title: ");
					String title=scanner.nextLine();
					System.out.print("Enter Book Price: ");
					Double price=scanner.nextDouble();
					System.out.println("Enter the Number of Authors: ");
					Integer authorCount=scanner.nextInt();
					List<Author> authorList=new ArrayList<Author>();
					for(int i=0; i<authorCount; i++) {
						System.out.println("Enter Author Details: ");
						System.out.print("Enter First Name: ");
						String fName=scanner.next();
						System.out.print("Enter Middle Name: ");
						String mName=scanner.next();
						System.out.print("Enter Last Name: ");
						String lName=scanner.next();
						System.out.print("Enter Phone Number: ");
						BigInteger phone=scanner.nextBigInteger();
						Author author=new Author();
						author.setFirstName(fName);
						author.setMiddleName(mName);
						author.setLastName(lName);
						author.setPhoneNumber(phone);
						authorList.add(author);
					}
					Book book=new Book();
					book.setISBN(ISBN);
					book.setTitle(title);
					book.setPrice(price);
					book.setAuthorList(authorList);
					bookService.save(book);
					break;
				}case 6:{
					System.out.print("Enter ISBN: ");
					BigInteger ISBN=scanner.nextBigInteger();
					System.out.println(bookService.find(ISBN));
					break;
				}case 7:{
					System.out.print("Enter ISBN: ");
					BigInteger ISBN=scanner.nextBigInteger();
					System.out.print("Enter Book Title: ");
					String title=scanner.nextLine();
					System.out.print("Enter Book Price: ");
					Double price=scanner.nextDouble();
					Book book=new Book();
					book.setISBN(ISBN);
					book.setTitle(title);
					book.setPrice(price);
					bookService.update(book);
					break;
				}case 8:{
					System.out.print("Enter ISBN: ");
					BigInteger ISBN=scanner.nextBigInteger();
					System.out.println(bookService.remove(ISBN));
					break;
				}case 0:{
					break;
				}default:{
					System.out.print("Invalid Input.");
				}
			}
		}while(choice!=0);
		scanner.close();
		
	}
	
}
