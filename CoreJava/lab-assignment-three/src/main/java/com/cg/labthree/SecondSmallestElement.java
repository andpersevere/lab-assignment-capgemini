package com.cg.labthree;

import java.util.Arrays;

public class SecondSmallestElement {

	public int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		return a[1];
	}
}
