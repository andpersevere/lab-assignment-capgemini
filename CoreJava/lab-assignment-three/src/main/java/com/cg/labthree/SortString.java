package com.cg.labthree;

import java.util.Arrays;

public class SortString {
	public String[] sort(String[] s) {
		for (int i = 0; i < s.length / 2; i++) {
			char[] temp = s[i].toCharArray();
			Arrays.sort(temp);
			String sorted = new String(temp);
			s[i] = sorted.toLowerCase();
		}
		for (int i = s.length / 2; i < s.length; i++) {
			char[] temp = s[i].toCharArray();
			Arrays.sort(temp);
			String sorted = new String(temp);
			s[i] = sorted.toUpperCase();
		}
		return s;
	}
}
