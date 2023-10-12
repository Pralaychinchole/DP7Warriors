package com.arraylab;

import java.util.Arrays;

public class AdditionArray {

	static void sum(int ar[])
	{
		int sum=0;
		
		for(int i=0;i<ar.length/2;i++)
		{
			
			sum=ar[i]+ar[ar.length-i-1];
			System.out.println(sum);
		}
		
	}
	
	public static void main(String[] args) {
		  
		int ar[]= {1,2,3,4,5,6};  //addition 1+6=7 ; 2+5=7; 3+4=7;
		
		sum(ar);

	}

}
