package com.cg.labfive;

import com.cg.labfive.Exception.EmployeeException;
import com.cg.labfive.Exception.UserDefinedException;

public class MyMain {
	public static void main(String[] args) throws UserDefinedException {
		// TODO Auto-generated method stub

		ExerciseOne exerciseOne = new ExerciseOne();
		exerciseOne.simulateTrafficLights();

		ExerciseTwo exerciseTwo = new ExerciseTwo();
		exerciseTwo.fibonacciSequence();

		ExerciseThree exerciseThree = new ExerciseThree();
		exerciseThree.printPrimes();

		try {
			ExerciseFour exerciseFour = new ExerciseFour();
			exerciseFour.runException();
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}
}
