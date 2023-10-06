package com.Advance;

import java.util.Arrays;

public class Rightrotate {

	static void rotateOnce(int ar[])
	{
		int lastE=ar[ar.length-1];
				
		for (int i=ar.length-1;i>0;i--)
		{
			ar[i]=ar[i-1];
			
		}
		
		ar[0]=lastE;
		
		//System.out.println(Arrays.toString(ar));
	}
	
	public static void main(String[] args) {
		 
		int ar[]= {3,1,2,5,6,4};
		System.out.println("before============");
	  System.out.println(Arrays.toString(ar));
	  int n=3;
	  for(int i=0;i<n;i++)
	  {
		  rotateOnce(ar);
	  }
	  System.out.println("after==================");
		System.out.println(Arrays.toString(ar));
	}

}
