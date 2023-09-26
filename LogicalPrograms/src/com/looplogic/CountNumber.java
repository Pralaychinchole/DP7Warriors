package com.looplogic;
import java.util.Scanner;

public class CountNumber {

   static void count(int n,int luckynum)
   {
	   int count=0;
	   while(n>0) {
	   
	        int rem=n%10;
		   if (rem==luckynum)
		   {
			   count++;
			   
		   }
		   n=n/10;
	   }  
  System.out.println("Count of number is"+count);
   }
   
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the name");
		
		String name=sc.next();
		
System.out.println("Enter the car number");
		int carnum=sc.nextInt();
		
		System.out.println("Enter the lucky number");
		int luckynum=sc.nextInt();
		
		count(carnum,luckynum);
	}

}
