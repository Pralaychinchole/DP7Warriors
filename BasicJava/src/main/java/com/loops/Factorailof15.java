package com.loops;
import java.util.Scanner;

public class Factorailof15 {

	public static void main(String[] args) {
		long fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		
		for (int i=1;i<=num;i++)
		
		{
			fact*=i;
			
		}
			System.out.println("the factorial are"+fact);
			
			
		
			
		
				
				
		
		
		

	}

}
