package com.arraylab;

import java.util.Arrays;

public class EvenOddShifting {

	static void shifting(int arr[])
	{
		int temp[]=new int[arr.length];
		
		int index=0;
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				temp[index]=arr[i];
				index++;
			}
			
		}
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2!=0)
			{
				temp[index]=arr[i];
				index++;
			}
			
		}
		
		System.out.println(Arrays.toString(temp));
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,5,6,8,9};
		
		shifting(arr);
		
		

	}

}
