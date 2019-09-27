package com.cg.labfive;

import java.util.Scanner;

import com.cg.labfive.Exception.EmployeeException;
import com.cg.labfive.Exception.UserDefinedException;

public class ExerciseFour {
	public void runException() throws UserDefinedException, EmployeeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String fName = sc.next();
		System.out.println("Enter the middle name: ");
		String mName = sc.next();
		System.out.println("Enter the last name: ");
		String lName = sc.next();
		
		if(fName.length()==0 || lName.length()==0)
			throw new UserDefinedException("First/Last Name are null");
		
		System.out.println("Enter the age: ");
		int age= sc.nextInt();
		
		if(age<15)
			throw new UserDefinedException("Age should be above 15");
		
		System.out.println("Enter the salary: ");
		double sal= sc.nextDouble();
		
		if(sal<3000)
			throw new EmployeeException("Salary should be above 3000");
	}
}
