package com.cg.labbook.labone;


public class AssignmentThree {
	public boolean checkNumber(int num) {
		int onesPlace = num%10, tensPlace = (num%100)/10;
		
		while(num/100 > 0) {
			
			if(tensPlace > onesPlace)
				return false;
				
			num = num/10;
			
			tensPlace = (num%100)/10;
			onesPlace = num%10;
		}
		if(tensPlace > onesPlace)
			return false;
		return true;
	}
}
