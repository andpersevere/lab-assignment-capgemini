package com.cg.jdbc.dao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.jdbc.dto.Author;
import com.cg.jdbc.dto.Book;
import com.cg.jdbc.exception.MyException;
import com.cg.jdbc.util.DBUtil;

public class LibraryDaoImpl implements LibraryDao {

	private static Connection connection;
	private PreparedStatement prepStatement;
	private ResultSet resultSet;
	private static Logger myLogger;
	
	static {
		Properties props=System.getProperties();
		String userDir=props.getProperty("user.dir")+"/src/main/resources/";
		PropertyConfigurator.configure(userDir+"/log4j.properties");
		myLogger=Logger.getLogger("LibraryDao.class");
		myLogger.info("Current Working directory is "+userDir);
		try {
			connection=DBUtil.getConnection();
			myLogger.info("Connection Obtained.");
		}catch(MyException e) {
			myLogger.info("Connection Error: "+e);
		}
	}
	
	public Author addAuthor(Author author) {
		String sql="INSERT INTO author(first_name, middle_name, last_name, phone_number) VALUES(?,?,?,?);";
		try {
			prepStatement=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			prepStatement.setString(1, author.getFirstName());
			prepStatement.setString(2, author.getMiddleName());
			prepStatement.setString(3, author.getLastName());
			prepStatement.setLong(4, author.getPhoneNo().longValue());
			prepStatement.executeUpdate();
			resultSet=prepStatement.getGeneratedKeys();
			BigInteger genId=BigInteger.valueOf(0);
			if(resultSet.next()) {
				genId=BigInteger.valueOf(resultSet.getLong(1));
			}
			System.out.println("Author Created with Id: "+genId);
			author.setAuthorId(genId);
		}catch(SQLException e) {
			myLogger.info("Error in addAuthor Dao: "+e);
		}finally {
			if(prepStatement!=null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					myLogger.info("Error in Author Dao: "+e);
				}
			}
		}
		return author;
	}

	public Author updateAuthor(Author author) {
		String sql="UPDATE Author SET first_name=?, middle_name=?, last_name=?, phone_number=? WHERE author_id=?";
		try {
			prepStatement=connection.prepareStatement(sql);
			prepStatement.setString(1, author.getFirstName());
			prepStatement.setString(2, author.getMiddleName());
			prepStatement.setString(3, author.getLastName());
			prepStatement.setLong(4, author.getPhoneNo().longValue());
			prepStatement.setLong(5, author.getAuthorId().longValue());
			prepStatement.executeUpdate();
		}catch(SQLException e) {
			myLogger.info("Error in updateAuthor Dao: "+e);
		}finally {
			if(prepStatement!=null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return author;
	}

	public Author findAuthor(BigInteger authorId) {
		String sql="SELECT * FROM author where author_id=?";
		Author author=new Author();
		try {
			prepStatement=connection.prepareStatement(sql);
			prepStatement.setLong(1, authorId.longValue());
			resultSet=prepStatement.executeQuery();
			if(resultSet.next()) {
				author.setAuthorId(BigInteger.valueOf(resultSet.getLong("author_id")));
				author.setFirstName(resultSet.getString("first_name"));
				author.setMiddleName(resultSet.getString("middle_name"));
				author.setLastName(resultSet.getString("last_name"));
				author.setPhoneNo(BigInteger.valueOf(resultSet.getLong("phone_number")));
			}
		}catch(SQLException e) {
			myLogger.info("Error in findAuthor Dao: "+e);
		}finally {
			if(prepStatement!=null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					myLogger.info("Error in findAuthor Dao: "+e);
				}
			}
		}
		return author;
	}

	public boolean deleteAuthor(BigInteger authorId) {
		String sql="DELETE FROM Author WHERE author_Id=?";
		try {
			prepStatement=connection.prepareStatement(sql);
			prepStatement.setLong(1, authorId.longValue());
			prepStatement.executeUpdate();
		}catch(SQLException e) {
			myLogger.info("Error in deleteAuthor Dao: "+e);
		}finally {
			if(prepStatement!=null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					myLogger.info("Error in deleteAuthor Dao: "+e);
				}
			}
		}
		return true;
	}

	@Override
	public List<Book> findBook(BigInteger authorId) {
		String sql="SELECT * FROM Book WHERE ISBN IN(SELECT ISBN FROM Library WHERE author_id=?)";
		List<Book> bookList=new ArrayList<Book>();
		Book book;
		try {
			prepStatement=connection.prepareStatement(sql);
			prepStatement.setLong(1, authorId.longValue());
			resultSet=prepStatement.executeQuery();
			System.out.println(resultSet);
			while(resultSet.next()) {
				book=new Book();
				book.setISBN(BigInteger.valueOf(resultSet.getLong("ISBN")));
				book.setTitle(resultSet.getString("title"));
				book.setPrice(resultSet.getDouble("price"));
				System.out.println(book);
				bookList.add(book);
			};
		}catch(SQLException e) {
			myLogger.info("Error in findBook Dao: "+e);
		}finally {
			if(prepStatement!=null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					myLogger.info("Error in findBook Dao: "+e);
				}
			}
		}
		System.out.println(bookList);
		return bookList;
	}

	@Override
	public boolean addBookAndAuthor(Book book, Author author) {
		String sql="INSERT INTO author(first_name, middle_name, last_name, phone_number) VALUES(?,?,?,?);";
		try {
			prepStatement=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			prepStatement.setString(1, author.getFirstName());
			prepStatement.setString(2, author.getMiddleName());
			prepStatement.setString(3, author.getLastName());
			prepStatement.setLong(4, author.getPhoneNo().longValue());
			prepStatement.executeUpdate();
			resultSet=prepStatement.getGeneratedKeys();
			BigInteger genId=BigInteger.valueOf(0);
			if(resultSet.next()) {
				genId=BigInteger.valueOf(resultSet.getLong(1));
				author.setAuthorId(genId);
			}
			System.out.println("Author Created with Id: "+genId);
		}catch(SQLException e) {
			myLogger.info("Error in addBookAuthor Dao: "+e);
		}
		sql="INSERT INTO BOOK(title, price) VALUES(?,?);";
		try {
			prepStatement=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			prepStatement.setString(1, book.getTitle());
			prepStatement.setDouble(2, book.getPrice());
			prepStatement.executeUpdate();
			resultSet=prepStatement.getGeneratedKeys();
			BigInteger genId=BigInteger.valueOf(0);
			if(resultSet.next()) {
				genId=BigInteger.valueOf(resultSet.getLong(1));
				System.out.println("Book Created with Id:"+ genId);
			}
			book.setISBN(genId);
		}catch(SQLException e) {
			myLogger.info("Error in addBookAuthor Dao: "+e);
		}
		sql="INSERT INTO Library VALUES(?,?);";
		try {
			prepStatement=connection.prepareStatement(sql);
			prepStatement.setLong(1, book.getISBN().longValue());
			prepStatement.setLong(2, author.getAuthorId().longValue());
			prepStatement.executeUpdate();
		}catch(SQLException e) {
			myLogger.info("Error in addBookAuthor Dao: "+e);
		}finally {
			if(prepStatement!=null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					myLogger.info("Error in addBookAuthor Dao: "+e);
				}
			}
		}
		return true;
	}

	@Override
	public boolean updateBookPrice(String authorName, Double price) {
		String sql="UPDATE book SET price=? WHERE ISBN=(SELECT ISBN FROM Library WHERE author_id IN(SELECT author_id FROM Author WHERE first_Name=?));";
		try {
			prepStatement=connection.prepareStatement(sql);
			prepStatement.setDouble(1, price);
			prepStatement.setString(2, authorName);
			prepStatement.executeUpdate();
		}catch(SQLException e) {
			myLogger.info("Error in updateBookPrice Dao: "+e);
		}finally {
			if(prepStatement!=null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					myLogger.info("Error in updateBookPrice Dao: "+e);
				}
			}
		}
		return true;
	}

}
