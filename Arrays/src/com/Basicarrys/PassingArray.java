package com.Basicarrys;

import java.util.Arrays;

public class PassingArray {

	static void squareArrays(int ar[])
	{
		
	for (int i=0;i<ar.length;i++)
	{
		ar[i]=ar[i]*ar[i];
	}
	
	System.out.println(Arrays.toString(ar));

}
	public static void main(String[] args) {
		
		int arr[]= {1,6,7,8,3};
		//square of each element
		
		System.out.println("Before:"+Arrays.toString(arr));
		squareArrays(arr);
		
		System.out.println("after:"+Arrays.toString(arr));

	}

}
