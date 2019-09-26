package com.cg.jdbc.lab2.exception;

public class MyException extends Exception {
	
	private String message;

	public MyException(String message) {
		super(message);
	}

}
