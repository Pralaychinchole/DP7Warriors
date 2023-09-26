package com.looplogic;
import java.util.Scanner;
public class Armstrongnum {

	static void armsstrong(int num)
	{ 
		int num1=num;
		int sum=0;
		while(num>0) 
		{	
			int rem=num%10;
			
			int result=rem*rem*rem;
			sum=sum+result;
			num=num/10;
		}
		if (sum==num1)
		{
			System.out.println("The number is armstrong"+num);
		}
		else
		{
			System.out.println("The num is not armstrong");
		}
		
	}
		
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		armsstrong(num);
		
	}

}
