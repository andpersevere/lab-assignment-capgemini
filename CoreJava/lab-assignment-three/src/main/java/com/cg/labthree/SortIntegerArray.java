package com.cg.labthree;

import java.util.Arrays;

public class SortIntegerArray {
	public int[] sort(int[] a,int n) {
		int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        }
		Arrays.sort(b);
		return b;
	}
}
