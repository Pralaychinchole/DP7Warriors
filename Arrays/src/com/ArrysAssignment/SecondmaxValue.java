package com.ArrysAssignment;

public class SecondmaxValue {
	// 1. WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]

	static void secondmax(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				// swapping
				if (ar[i] >ar[j])// as
				{
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int ar[] = { 20, 0, 31, 45, 100, 1, 105, 90 };

		secondmax(ar);

		System.out.println("Second highest number:" + ar[ar.length - 2]);

	}

}
