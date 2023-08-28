package com.basic;

import java.util.Scanner;

public class Speed {
  
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
	System.out.println("Enter the Distance");
	
	float distance= sc.nextFloat();
	
	System.out.println("Enter the time");
	
	float time=sc.nextFloat();
	
	float speed=distance/time;
	
	System.out.println("The Speed of car is"+speed);
	
	
	

		
		
		
		
	}
	
	
	
	
}
