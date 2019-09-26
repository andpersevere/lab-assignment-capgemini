package com.cg.jdbc.lab2.dao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.jdbc.lab2.dto.Author;

public class AuthorDao implements IAuthorDao {
	
	private static Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;
	private static Logger myLogger;
	
	static {

		Properties props = System.getProperties();
		String userDir = props.getProperty("user.dir") + "/src/main/resources/";
		System.out.println("Current working directory is " + userDir);
		PropertyConfigurator.configure(userDir + "log4j.properties");
		myLogger = Logger.getLogger("DBUtil.class");
	}
	
	static {
		try {
			connection= com.cg.jdbc.lab2.util.DBUtil.getConnection();
			myLogger.info("connection obtainer");
		} catch (com.cg.jdbc.lab2.exception.MyException e) {
			myLogger.error("Connection not obtained at EmployeeDao :"+e);
		}
	}

	public boolean addAuthor(Author author) {
		String message = "Error at addEmployee Dao method";
		String sql ="insert into author(author_Id,first_Name,middle_Name,last_Name,phone_Number) values(?,?,?,?,?)";		
		try {
		//step1 : obtain ps
			ps= connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		//step 2: set the ps placeholder values
			ps.setLong(1, author.getAuthorId().longValue());
			ps.setString(2, author.getFirstName());
			ps.setString(3, x);
		//step 3: execute Query (for DML we have executeUpdate method )
			int noOfRec = ps.executeUpdate();
		//getting the auto-generated value
			BigInteger generatedId = BigInteger.valueOf(0L);
			rs = ps.getGeneratedKeys();
			if (rs.next()) {
				generatedId = BigInteger.valueOf(rs.getLong(1));
				 System.out.println("Auto generated Id " + generatedId);
			}
		//setting the auto-generated Id to current emp obj
			employee.setEmpId(generatedId);
		} catch (SQLException e) {
			myLogger.error(message);
			System.out.println(" Error at addEmployee Dao method : "+e);
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					System.out.println(" Error at addEmployee Dao method : "+e);
				}
			}
		}
		return false;
	}

	public boolean removeAuthor(Author author) {
		// TODO Auto-generated method stub
		return false;
	}

	public Author updateAuthor(Author author) {
		// TODO Auto-generated method stub
		return null;
	}

	public Author searchAuthor(BigInteger authorId) {
		return null;
	}

}
