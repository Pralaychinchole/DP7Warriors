package com.switchst;
import java.util.Scanner;

public class WeekNumber {

	public static void main(String[]args) {
	
	Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter the week in days(1to7)");
	
	int weekdays=sc.nextInt();
	
	switch(weekdays)
	{ 
		case 1:System.out.println("Monday");	
		break;
		case 2:System.out.println("thuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("thursday");
	    break;
	    case 5:System.out.println("Friday");
	    break;
	    case 6:System.out.println("Saturday");
        break;
        case 7:System.out.println("Sunday");
	     break;
	     default:System.out.println("Error in input");   
	}
	
	System.out.println("Enjoy your day");
	
	}
}
