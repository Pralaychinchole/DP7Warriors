package com.Basicarrys;

public class SumofevenArrays {

	static int findsum(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				sum+=ar[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,5,7,34,4};
     
		System.out.println("sum of even number is:"+findsum(arr));
		
	}

}
