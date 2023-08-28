package com.switchst;
import java.util.Scanner;
public class Monthindays {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Month name in days lower case");
		String name =sc.next();

		
		 switch(name)
		 
		 {
		 case "january":
		 case "march":
		 case "may":
		 case "july":
		 case "aug":
		 case "oct":
		 case "dec":
		 System.out.println("31 days");
		 break;
		 
		 case "april":
		 case "jun":
		 case "Sep":		 
		 case "Nov":
	  System.out.println("30 days");
			 break;
		 
		 case "feb":
			  System.out.println("28 days");
		
		 }
	}

}
