package com.mock;

import java.util.Arrays;

public class Demo1 {

	// write a code to display average of odd element from array
	static void oddElement(int ar[]) {
		int sum = 0;
		int avg = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i++)
			if (ar[i] % 2 != 0) {

				sum += ar[i];
				count++;
				
				avg = sum/count;
			}
		
		System.out.println(avg);

	}

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		oddElement(ar);
	}

}
