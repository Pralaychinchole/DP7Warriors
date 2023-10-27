package com.exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VotingException {

	public static void main(String[] args) {
		
		int age;
		
		try
		{
		
		Scanner sc= new Scanner (System.in);
	
		System.out.println("Eneter age");
		
	     age=sc.nextInt();
	    
	    if (age>18)
	    {
	        System.out.println("eligible for vote");
	    }
	    else
	    {
	    	System.out.println("You cannot vote");
	    }
		
	}
	   
	catch(InputMismatchException e)
	{
	        System.out.println(e+"Age entered was not in number");	
	}
	
    finally
    {
    	System.out.println("thanks for voting");
    }
		
	}	
		
}
	
	
	
