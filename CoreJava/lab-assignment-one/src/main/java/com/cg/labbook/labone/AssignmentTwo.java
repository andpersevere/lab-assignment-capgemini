package com.cg.labbook.labone;


public class AssignmentTwo {
	public int calculateDifference(int num) {
		int sum = 0, sumSquares = 0;
		
		while(num>0) {
			sumSquares += (num*num);
			sum += num--;
		}
		
		return (sumSquares) - (sum*sum);
	}
}
