package com.CustomException;

import java.util.Scanner;
public class NameAccept {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the name");
		String name=sc.next();
		
		try 
		{
		    if(name.length()<3)
		    {
		       throw new InvalidNameException("name shoild be greater then 3 character ");
		       
		    }
			
		    System.out.println("Welcome");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
