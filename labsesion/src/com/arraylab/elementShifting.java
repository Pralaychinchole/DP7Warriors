package com.arraylab;

import java.util.Arrays;
//left side shiftin
public class elementShifting {

	static void Shifting(int ar[]) {
		int temp[] = new int[ar.length];
		int count = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				temp[count] = ar[i];
				count++;
			}

		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				temp[count] = ar[i];
				count++;
			}

		}

		System.out.println(Arrays.toString(temp));

	}
//right shifting
	static void Rightshifting(int ar[])
	{
		
			int temp[] = new int[ar.length];
			int count = 0;
		
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] != 0) {
					temp[count] = ar[i];
					count++;
				}

			}
			
			System.out.println(Arrays.toString(temp));
	}
	
	public static void main(String[] args) {

		int ar[] = { 1, 0, 12, 0 ,4,8};
System.out.println("Left shifting====================");
		Shifting(ar);
		
		System.out.println("right shifting==============");
		Rightshifting(ar);

	}

}
