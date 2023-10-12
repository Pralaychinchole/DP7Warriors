package com.arraylab;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeArraysum {

	static void primesum(int ar[])
	{
	
		int sum=0;
		for (int i=0;i<ar.length;i++)
		{
			boolean status=true;
			for(int j=2;j<ar[i];j++) {
				
			if (ar[i]%j==0)
			{
				status=false;
				//break;
				
			}
			
		}
			
		if (status)
		{
			System.out.println(ar[i]);
			sum=sum+ar[i];
			
		}
		
		
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
	
		int ar[]= {11,3,5,6,7,9};
		
 
		primesum(ar);
		
		System.out.println(Arrays.toString(ar));
	}

}
