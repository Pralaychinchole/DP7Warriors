package com.looplogic;

public class FactorialNumber {

	static void factnumber(int n)
	{
		
		long fact =1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
			
		}
		
		System.out.println("factorial of "+n+"is"+fact);
		
	}
		public static void main(String[]args) 
		{
//			int num=7;           //ctrl+7 comment
//			int num=9;
//			
			factnumber(7);
			factnumber(9);
			
		
			
		
		
		
	}
	
	
	
	
	
}
