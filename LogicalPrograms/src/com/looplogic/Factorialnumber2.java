package com.looplogic;

public class Factorialnumber2 {

	static long factnumber(int n)
	
	{
		long fact=1;
	
		for (int i=1;i<=n;i++)
		{
			fact*=i;
			
		}
	
	return fact;
	}
	
	public static void main(String[]args)
	{
		long ans;// last statment
		
		ans=factnumber(7);
		System.out.println("The factor of 7 is"+ans);
		
		ans=factnumber(9);
		System.out.println("The factor of 9 is"+ans);

		ans=factnumber(5);
		System.out.println("The factor of 5 is"+ans);
		
	
	
	
	
	}
	
	
}
