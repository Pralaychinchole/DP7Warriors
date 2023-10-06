package com.Basicarrys;

public class Maximumnumarray {
      
	static void maximum(int ar[])
	{
		int max=Integer.MIN_VALUE;
				
		for(int i=0;i<ar.length;i++)
		{
			if (ar[i]>max)
			{
				max=ar[i];
			}
		}
		
		System.out.println("maximum num is :"+max);
	}
	
	public static void main(String[] args) {
	   
		int ar[]= {1,67,45,34};
	
		maximum(ar);

	}

}
