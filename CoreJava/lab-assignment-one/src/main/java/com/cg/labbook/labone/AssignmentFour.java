package com.cg.labbook.labone;


public class AssignmentFour {
	public boolean checkNummber(int num) {
		int rem = 0;
		while(rem == 0) {
			rem = num%2;
			num = num/2;
		}
		if(num != rem)
			return false;
		else 
			return true;
	}
}
