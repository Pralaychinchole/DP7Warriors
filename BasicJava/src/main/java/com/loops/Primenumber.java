package com.loops;
import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		//   2 3 5 7 11........Prime number
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		
		boolean flag=false;
		//int count=0
				
				for (int i=2;i<num;i++)
				{
					if(num%i==0)
					{
						flag=true;
								//int count=1
					break;
					}	
			
				}
					
		if(flag==false)//or count==0
		
		{
			System.out.println(" prime number");
		}
		
		else
		{
			System.out.println("It is not a prime number");
		}
		

	}

}
