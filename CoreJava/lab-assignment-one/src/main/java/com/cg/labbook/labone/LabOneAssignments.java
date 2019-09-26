package com.cg.labbook.labone;

import java.util.Scanner;

public class LabOneAssignments {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		AssignmentOne one = new AssignmentOne();
		AssignmentTwo two = new AssignmentTwo();
		AssignmentThree three = new AssignmentThree();
		AssignmentFour four = new AssignmentFour();
		
		System.out.println("Enter any number: ");
		int num = scr.nextInt();
		
		System.out.println("The sum of first n natural numbers which are divisible by 3 or 5: " + one.calculateSum(num));
		System.out.println("The difference between the sum of the squares of the first n natural numbers and the square of their sum: " + two.calculateDifference(num));
		System.out.println("The given number is an increasing number: " + three.checkNumber(num));
		System.out.println("The given input is a power of two: " + four.checkNummber(num));
		
		
	}
}
