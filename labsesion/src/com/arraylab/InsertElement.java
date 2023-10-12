package com.arraylab;
import java.util.Arrays;
import java.util.Scanner;
public class InsertElement {

	static void elementadd(int ar[],int index,int value) 
	{
		for(int i=ar.length-1;i>index;i--)
		{
			ar[i]=ar[i-1];
		}
		
		for (int i=0;i<ar.length;i++) {
			
			System.out.println(ar[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		int ar[]= new int [6];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) 
		{
			System.out.println("Enter the value");
		
			ar[i]=sc.nextInt();
		}
		
		elementadd(ar,2,100);
		
		System.out.println(Arrays.toString(ar));
		
		
		}

	}


