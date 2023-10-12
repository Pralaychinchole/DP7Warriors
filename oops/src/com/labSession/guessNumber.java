package com.labSession;

import java.util.Scanner;

public class guessNumber {


	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		   
		int fixed=45;
		int count=0;
		
		while(fixed!=0)
		{
			System.out.println("Guess number");
			   int  num=sc.nextInt();
			   count++;
		      if(fixed<num)
		      {
		    	  System.out.println("you have enter higher number"); 
		      }
		      else if(fixed>num)
		      {
		    	  System.out.println("you have enter lower number");
		      }
		      else if (fixed==num)
		      {
		   	  System.out.println("congrets you have guess correct number");
		            System.out.println("no of gusses"+count);
		     break;
		      }
		
		
		
		
		
		
		
		}
		
	}

}
