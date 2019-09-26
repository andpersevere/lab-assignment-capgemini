package com.cg.labeight;

import java.util.StringTokenizer;

public class ExerciseOne {
	public void printIntegerSum(String input) {
		int sum=0;
		StringTokenizer token = new StringTokenizer(input, " "); 
	    while (token.hasMoreTokens()) { 
	    	int a = Integer.parseInt(token.nextToken());
	    	System.out.println(a);
	    	sum+=a;    
	    }
	    System.out.println("Sum is "+sum);
	}
}
