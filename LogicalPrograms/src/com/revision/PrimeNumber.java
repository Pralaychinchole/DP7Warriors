package com.revision;

public class PrimeNumber {
		
		static boolean checkPrime(int num)
		{
			boolean status=true;
			
			
			if((num==0)||(num==1))
			{
				status=false;
				
			}
			
			
			for(int i=2;i<num;i++)
			{
				if(num%i==0) 
				{
				   status=false;
				   break;
				}
			}
			
			return status;
		}
	
		
public static void main(String args[])
{
	
	System.out.println("Prime numbers from 1 to 50 are:");
	
	for(int i=1;i<=50;i++)
	{
		if(checkPrime(i))
		{
			System.out.println(i);
		}
	}
}
}	
		