package com.Basicarrys;

public class Divisiblearray {

	
	
	public static void main(String[] args) {
	
		int arr[] ={3,5,15,20,23};
        int sum=0;
		for (int i:arr)
		{
			if(i%3==0 && i%5==0)
				
			{
				sum=sum+i;
			}
			
		}
		System.out.println("sum of num is"+sum);
	}

}
