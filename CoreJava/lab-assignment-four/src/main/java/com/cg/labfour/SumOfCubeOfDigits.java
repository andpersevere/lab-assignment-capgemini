package com.cg.labfour;

public class SumOfCubeOfDigits {
	public int getSum(int n) {
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += Math.pow(digit, 3);
			n = n / 10;
		}
		return sum;
	}
}
