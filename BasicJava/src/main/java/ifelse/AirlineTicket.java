package ifelse;
import java.util.Scanner;

public class AirlineTicket {

	public static void main (String[]args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Airline name");
	String name= sc.next();
	
	
	System.out.println("Enter the depart place");	
	String place=sc.next();
	
	System.out.println("Enter the Destination place");
    String Destination=sc.next();
    
    System.out.println("Enter the coupan code");
	int code=sc.nextInt();
	
	if (code==12345)
	{
	   double price=10000;
			   System.out.println("the providing 10% discout");
	 double discount=price*0.1;
	 System.out.println("Your discout is"+discount);
	 System.out.println("Congratulation your ticket is book");
	 }
	
	else 
		
	{
	System.out.println("Code is invalid....."); 
	}
	
	
	
	
	
	}
	
}
