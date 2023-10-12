package com.arraylab;

import java.util.Arrays;
import java.util.Scanner;

public class Findnum {

	static  void alternatenum(int ar[])
	{
		int sum=0;
		for (int i=0;i<ar.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+ar[i];
			}
			
		}
		
		System.out.println("sum="+sum);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("array size");
		
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		
		for (int i=0;i<ar.length;i++)
		{
			System.out.println("Enter the num");
			ar[i]=sc.nextInt();
			
		}
			
		alternatenum(ar);
		
		System.out.println(Arrays.toString(ar));
             
	}

}
