package com.looplogic;
import java.util.Scanner;
public class AsendingOrder {

	
	
	public static void main(String[]args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int flag=0;
		
		while(num>0)
		{
			int increase=num%10;
			
			int temp=num;
			
			while(temp>0)
			{
				int rem=temp%10;
				if (rem>increase)
				{
					flag=1;
					break;
				}
				temp=temp/10;
				
    	}
		
		num=num/10;
		
		}
		if (flag==0)
		{
			
			System.out.println("Assending order");
		}
		else
		{
			System.out.println("Bouncy number");
		}
		
	}
	
}
    