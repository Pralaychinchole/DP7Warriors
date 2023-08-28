package com.condition;
import java.util.Scanner;

public class NestedIfDemo3 {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the percentage");
		float percentage= sc.nextFloat();
		
		System.out.println("Enter the marks of pcm");
		float  pcm=sc.nextFloat();
		
		if((percentage>=90)||(pcm>=80))
		{
			System.out.println("Eligible for addmision");
		}
		else
		{
			System.out.println("Not eligible for addmision");
		}
		
		
		
		
		
		
	}
}
