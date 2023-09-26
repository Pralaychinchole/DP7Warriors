package com.Whileloop;
import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		
	Scanner sc =new Scanner (System.in);
	
		System.out.println("Enter any number");
		int num= sc.nextInt();
		int num1;
		int rem=0;
		int sum=0;
		num1=num;
		while(num!=0)
		{
			rem=num%10;
			sum+=num;
			num/=10;
			
		}
			if(num%sum==0)
			{
				System.out.println("Its a harshad number");
				
			}
			else {
			System.out.println("It is not a harshad num");
			}

	}

}
