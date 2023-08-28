package ifelse;
import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1");
		Double num1=sc.nextDouble();
		
		System.out.println("Enter the  num2 ");
		Double num2=sc.nextDouble();

		System.out.println("to select operation");
		System.out.println("+. operation");
		System.out.println("-. operation");
		System.out.println("*.    multiplication ");
		System.out.println("/.  Dividation ");

		char operation= sc.next().charAt(0);
		
		switch (operation) {
		case '+':{
			System.out.println(num1+num2);}
		        
		case'-':{
            	System.out.println(num1-num2);	}
		case'*':{
			System.out.println(num1*num2);}
		
		case'/':{
			System.out.println(num1/num2);}	
	     default:
	     { System.out.println("invalid operation");	
	     }
		
		}
		
		
	}
}
