package com.cg.jdbc.ui;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.jdbc.dto.Author;
import com.cg.jdbc.dto.Book;
import com.cg.jdbc.service.LibraryService;
import com.cg.jdbc.service.LibraryServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		LibraryService libraryService=new LibraryServiceImpl();
		int choice=0;
		do {
			System.out.println("Enter 1 to Add Author.");
			System.out.println("Enter 2 to Find Author.");
			System.out.println("Enter 3 to Update Author.");
			System.out.println("Enter 4 to Delete Author.");
			System.out.println("Enter 5 to Find Book by AuthorId.");
			System.out.println("Enter 6 to Add Book and Author.");
			System.out.println("Enter 7 to Update Price by Author Name.");
			choice=scanner.nextInt();
			switch(choice){
				case 1:{
					System.out.print("Enter First Name: ");
					String fname=scanner.next();
					System.out.print("Enter Middle Name: ");
					String mname=scanner.next();
					System.out.print("Enter Last Name: ");
					String lname=scanner.next();
					System.out.print("Enter Phone Number: ");
					BigInteger phNo=scanner.nextBigInteger();
					Author author=new Author();
					author.setFirstName(fname);
					author.setMiddleName(mname);
					author.setLastName(lname);
					author.setPhoneNo(phNo);
					libraryService.addAuthor(author);
					break;
				}case 2:{
					System.out.print("Enter Author Id: ");
					BigInteger authorId=scanner.nextBigInteger();
					System.out.println(libraryService.findAuthor(authorId));
					break;
				}case 3:{
					System.out.print("Enter Author Id: ");
					BigInteger authorId=scanner.nextBigInteger();
					System.out.print("Enter First Name: ");
					String fname=scanner.next();
					System.out.print("Enter Middle Name: ");
					String mname=scanner.next();
					System.out.print("Enter Last Name: ");
					String lname=scanner.next();
					System.out.print("Enter Phone Number: ");
					BigInteger phNo=scanner.nextBigInteger();
					Author author=new Author();
					author.setAuthorId(authorId);
					author.setFirstName(fname);
					author.setMiddleName(mname);
					author.setLastName(lname);
					author.setPhoneNo(phNo);
					System.out.println(libraryService.updateAuthor(author));
					break;
				}case 4:{
					System.out.print("Enter Author Id: ");
					BigInteger authorId=scanner.nextBigInteger();
					System.out.println(libraryService.deleteAuthor(authorId));
					break;
				}
				case 5:{
					System.out.print("Enter the Author Id: ");
					BigInteger authorId=scanner.nextBigInteger();
					List<Book> bookList=libraryService.findBook(authorId);
					for(Book book: bookList) {
						System.out.println("\nISBN: "+book.getISBN());
						System.out.println("Title: "+book.getTitle());
						System.out.println("Price: "+book.getPrice());
					}
					break;
				}case 6:{
					System.out.print("Enter Book Title: ");
					String title=scanner.next();
					System.out.print("Enter Book Price: ");
					Double price=scanner.nextDouble();
					System.out.print("Enter Author First Name: ");
					String fname=scanner.next();
					System.out.print("Enter Author Middle Name: ");
					String mname=scanner.next();
					System.out.print("Enter Author Last Name: ");
					String lname=scanner.next();
					System.out.print("Enter Author Phone Number: ");
					BigInteger phNo=scanner.nextBigInteger();
					Book book=new Book();
					book.setTitle(title);
					book.setPrice(price);
					Author author=new Author();
					author.setFirstName(fname);
					author.setMiddleName(mname);
					author.setLastName(lname);
					author.setPhoneNo(phNo);
					libraryService.addBookAndAuthor(book, author);
					System.out.println("Done.");
					break;
				}case 7:{
					System.out.print("Enter Author First Name: ");
					String authorName=scanner.next();
					System.out.print("Enter New Price of Book(s): ");
					Double newPrice=scanner.nextDouble();
					System.out.println(libraryService.updateBookPrice(authorName, newPrice));
				}
			}
		}while(choice!=0);
		scanner.close();
	}

}
