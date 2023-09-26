package com.looplogic;
import java.util.Scanner;
public class checkPrime {
	
	static boolean checkprime(int num) 
	{	
		boolean status=true;
		if((num==0)||(num==1))
		
		
	status=false;
		else
		{
			for(int i=2;i<=num;i++)//i<n
			{
				
				status=false;
				break;
				
			}
			
			
		}
		
		return true;
	}	
	
	
	public static void main(String[]args)
	{
		
		int num =78654329;
		
		checkprime(num);
			
	}
	
}
