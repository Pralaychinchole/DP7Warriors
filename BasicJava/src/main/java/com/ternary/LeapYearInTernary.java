package com.ternary;
import java.util.Scanner;

public class LeapYearInTernary {

	public static void main(String[]args) {
		
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Year");
	
		int year=sc.nextInt();
		
		String Year=((year%4==0) && (year%100!=0) || (year%400==0))? "Yes" : "No";
		
		
       
		
		
		
		
	}
	
	
	
	
	
	
	
}
