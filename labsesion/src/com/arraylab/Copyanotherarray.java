package com.arraylab;

import java.util.Arrays;

public class Copyanotherarray {

	static void copyarray(int ar[])
	{
		int temp[]=new int [ar.length];
		
		
		for(int i=0;i<ar.length;i++)
		{
		    
			temp[i]=ar[i];
			
		}
		
		System.out.println("after:"+Arrays.toString(temp));
		
	}
	
	
	public static void main(String[] args) {
		
       int ar[]= {1,2,3,4,5};
       System.out.println("before:"+Arrays.toString(ar));
       copyarray(ar);
		
	}

}
