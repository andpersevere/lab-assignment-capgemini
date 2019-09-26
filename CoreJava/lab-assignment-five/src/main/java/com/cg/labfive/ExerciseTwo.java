package com.cg.labfive;

import java.util.Scanner;

public class ExerciseTwo {
	public void fibonacciSequence() {
		int a=1,b=1,c=0;
		System.out.print("Series is: "+a+" "+b);
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		for (int i = 2; i <= k; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		sc.close();
	}
}
