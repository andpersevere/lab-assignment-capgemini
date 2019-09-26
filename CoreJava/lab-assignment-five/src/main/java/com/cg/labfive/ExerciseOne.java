package com.cg.labfive;

import java.util.Scanner;

public class ExerciseOne {
	public void simulateTrafficLights() {
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		if (choice.equalsIgnoreCase("red"))
			System.out.println("stop");
		else if (choice.equalsIgnoreCase("yellow"))
			System.out.println("wait");
		else if (choice.equalsIgnoreCase("green"))
			System.out.println("go");

		sc.close();
	}
}
