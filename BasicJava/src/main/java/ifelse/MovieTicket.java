package ifelse;
import java.util.Scanner;

public class MovieTicket {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter movie name");
	   String movie=sc.next();
	   
	   System.out.println("Enter the rating");
	   float rating=sc.nextFloat();
	   
		System.out.println("Enter ticket price");
		int price=sc.nextInt();
		
		System.out.println("Enter the coupan code");
		int coupan=sc.nextInt();
		
		
		
		if (coupan==0)
		{
			System.out.println("Code is valid you get RS50 off"+(price-50));
			
			
		}
		else if (coupan==1)
		
			System.out.println("code is valid you RS100 off"+(price-100));
			
		
		else 
		{
			System.out.println("Your code is not valid "+price);
			
		}
		  
		
		
			
		
		
		
		
	}
	

}
