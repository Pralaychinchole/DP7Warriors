package com.switchst;
import java.util.Scanner;


public class CourseChoosing {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the Stream");
		String stream=sc.next();
		
		System.out.println("Enter the percentage");
		int percentage=sc.nextInt();
		
		
		
		switch (stream)
		
		{
		case "MBA":System.out.println("You are choosing MBA");
		break;
		case"MCA":System.out.println("You are chossing MCA");
		break;
		default :System.out.println("Better luck next time");  
		switch(percentage)
		{
		case 75:System.out.println("You get addmision MBA");
		break;
		case 70:System.out.println("You get addmision MCA");
		break;
		default :System.out.println("Better luck next time");
		}


		}	
		
		}

}
