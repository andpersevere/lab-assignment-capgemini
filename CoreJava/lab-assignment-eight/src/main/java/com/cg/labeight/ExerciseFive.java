package com.cg.labeight;

public class ExerciseFive {
	public boolean checkString(String input) {
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) > input.charAt(i + 1))
				return false;
		}
		return true;
	}
}
