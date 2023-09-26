package com.loops;
import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		  
		long fact=1;
		System.out.println("Enter any number");
				int num=sc.nextInt();
				
				for (int i=1;i<=num;i++)
				{
				fact=fact*i;    //fact*1;
				
				}
						
					System.out.println(+num+"is factor5"+fact);	
		
				
		
		
		
		
		

	}

}
