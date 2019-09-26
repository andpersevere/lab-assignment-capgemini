package com.cg.labnine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		
		ExerciseOne exerciseOne = new ExerciseOne();
		ExerciseTwo exerciseTwo = new ExerciseTwo();
		ExerciseThree exerciseThree = new ExerciseThree();
		
		Scanner sc = new Scanner(System.in);
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 10);
		map.put(2, 16);
		map.put(3, 14);
		map.put(4, 1);
		map.put(5, 100);
		map.put(6, 99);
		System.out.println(exerciseOne.sortMapToList(map));
		
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println(exerciseTwo.countCharacter(str.toCharArray()));
		
		int[] array = new int[] {1,2,3,4,5};
		System.out.println(exerciseThree.getSquares(array));
		
		sc.close();

	}

}
