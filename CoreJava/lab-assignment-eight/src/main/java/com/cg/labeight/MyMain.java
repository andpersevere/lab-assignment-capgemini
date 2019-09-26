package com.cg.labeight;

import java.util.Scanner;

public class MyMain {
	@SuppressWarnings("unused")
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		ExerciseOne exerciseOne = new ExerciseOne();
		ExerciseTwo exerciseTwo = new ExerciseTwo();
		ExerciseFive exerciseFive = new ExerciseFive();
		ExerciseEight exerciseEight = new ExerciseEight();
		
		System.out.println("Enter a line of integers");
		String input = sc.nextLine();
		exerciseOne.printIntegerSum(input);
		
		System.out.println("Enter a String");
		if(exerciseFive.checkString(sc.next()))
			System.out.println("Positive String");
		else
			System.out.println("Negative String");
		
		
		
		sc.close();
	}
}
