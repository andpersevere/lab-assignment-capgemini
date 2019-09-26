package com.cg.labbook.labone;


public class AssignmentOne {
	
	public int calculateSum(int num) {
			int sum = 0;
			while(num>0) {
				if((sum%3==0) || (num%5 == 0))
					sum += num;
				num--;
			}
			
			return sum;
		}
	
}
