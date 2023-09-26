package com.looplogic;
import java.util.Scanner;
public class FactorialMathodCalling {

	static void Factorial(int num)
	
	{
		long fact=1;
		int num1;
		
		for(int  i=1;i<=num;i++)
		{
			fact*=i;
		}
			
		System.out.println("Factorial of n is"+num+"is fact"+fact);
		
	}
	
	

	
	
	public static void main(String[] args) {
	
    Scanner sc=new Scanner (System.in);
    
    System.out.println("Enter the number");
	int num=sc.nextInt();
	
	     Factorial(num);
		
	}

}
