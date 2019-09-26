package com.cg.jdbc.dto;

import java.math.BigInteger;

public class Author {

	private BigInteger authorId;
	private String firstName;
	private String middleName;
	private String lastName;
	BigInteger phoneNo;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(BigInteger authorId, String firstName, String middleName, String lastName, BigInteger phoneNo) {
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
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
	public BigInteger getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(BigInteger phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}
	
}
