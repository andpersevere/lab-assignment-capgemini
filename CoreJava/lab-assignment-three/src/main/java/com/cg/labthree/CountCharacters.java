package com.cg.labthree;

public class CountCharacters {

	public int[] getCount(char[] a) {
		int[] b = new int[255];
		for(char i:a)
			b[i]++;
		return b;
	}
	
}
