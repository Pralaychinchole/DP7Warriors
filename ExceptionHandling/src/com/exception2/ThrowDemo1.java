package com.exception2;

import java.util.Scanner;

public class ThrowDemo1 {

	
	static Scanner sc=new Scanner(System.in);
	
	static void details()
	{
		
		System.out.println("Enter the name");
		
		String name=sc.next();
		
		
		System.out.println("Eneter the marks");
		
		int marks=sc.nextInt();
		
		if(marks<0)
		{
			
			throw new RuntimeException("Marks should be gretaer then zero");
		}
		else
		{
			if(marks>=40)
			{
				System.out.println(name+":has crack the exam");
			}
			else
			{
				System.out.println(name+"failed....");
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {

            details();

	}

}
