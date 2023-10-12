package com.ArrysAssignment;

import java.util.Arrays;

public class SecondMinValue {
//	2. WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23]

	static void SecondMinimum(int ar[]) {
		int temp;
		

		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if (ar[i] <ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {

		int ar[] = { -20, 0, -25, 15, 19, 37, 23 };

		SecondMinimum(ar);

		System.out.println("Second minimum number is:" + ar[ar.length - 2]);

	}

}
