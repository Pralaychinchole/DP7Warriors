package com.Exception;

import java.util.Scanner;

public class Exception1 {
	
	public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);    
        
        System.out.println("Enter the number");
        
        int num=sc.nextInt();
    try {    
        
		if (num>99999)
		{
			throw new OutOfRangeException("range should be greater the 99999");
		}
		System.out.println("number in range");
    }
    catch(OutOfRangeException e)
    {
    	System.out.println(e);
    }
	}

}
