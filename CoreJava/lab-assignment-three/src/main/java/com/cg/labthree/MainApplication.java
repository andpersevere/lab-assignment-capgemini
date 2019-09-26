package com.cg.labthree;

import java.util.*;

public class MainApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of Integers you want to fill in Array: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		
		System.out.println("Enter "+ n +" number of Integers: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		
		System.out.println("Enter your full name(string) : ");
		String name = sc.nextLine();
		String[] s = name.split(" ");
		
		
		CountCharacters countCharacters = new CountCharacters();
		SecondSmallestElement secondSmallestElement = new SecondSmallestElement();
		SortIntegerArray sortIntegerArray = new SortIntegerArray();
		SortString sortString = new SortString();
		
		System.out.println("Second smallest element: ");
		System.out.println(secondSmallestElement.getSecondSmallest(a));
		
		System.out.println("Sorted string : ");
		s = sortString.sort(s);
		for (String i : s)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.println("Sorted integer ARRAY : ");
		a = sortIntegerArray.sort(a, n);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("Count of Characters : ");
		char[] c = { 'a', 'b', 'c' };
		int[] b = countCharacters.getCount(c);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
