package com.cg.labfour;

import java.util.Scanner;

public class MyMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		SumOfCubeOfDigits sumOfCubeOfDigits = new SumOfCubeOfDigits();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sumOfCubeOfDigits.getSum(n));
		
	}
}
