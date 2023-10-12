package com.arraylab;

import java.util.Arrays;
import java.util.Scanner;

public class Averagerain {

	static void average(int ar[])
	{
		int sum=0;
		int avg;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
			
		}
		avg=sum/ar.length;
		System.out.println("average rainfall:"+avg);
		
		
	}
	
	public static void main(String[] args) {
		
         Scanner sc=new Scanner (System.in);
         
        System.out.println("array size ");
        
       int n =sc.nextInt();
       
       int ar[]=new int[n]; 
       
        for (int i=0;i<ar.length;i++)
        {
        	System.out.println("rainfall ");
        	
        	ar[i]=sc.nextInt();
        }	
        	average(ar);
        	
        	
        	
        
        
       
	}

}
