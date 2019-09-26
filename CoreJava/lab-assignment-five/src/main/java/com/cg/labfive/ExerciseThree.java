package com.cg.labfive;

import java.util.Scanner;

public class ExerciseThree {
	public void printPrimes() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k;
		int c=0;
		System.out.println("Prime numbers are");
		for (k = n; k > 1; k--) {

			for (int i = 1; i <= Math.pow(k, 0.5); i++) {
				if (k % i == 0)
					c++;
			}
			if(c==2)
				System.out.println(" "+c);
		}
		sc.close();
	}
}
