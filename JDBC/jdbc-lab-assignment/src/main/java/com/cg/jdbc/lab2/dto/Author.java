package com.cg.jdbc.lab2.dto;

import java.math.BigInteger;

public class Author {
	
	private BigInteger authorId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNo;
	public BigInteger getAuthorId() {
		return authorId;
	}
	public void setAuthorId(BigInteger authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", phoneNo=" + phoneNo + "]";
	}
	public Author(BigInteger authorId, String firstName, String middleName,
			String lastName, String phoneNo) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	public Author() {
		super();
	}
	
	

}
