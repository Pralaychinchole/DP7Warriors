package ifelse;
import java.util.Scanner;


public class ATM {
	
	public static void main(String[]args) {
		
	Scanner sc=new Scanner (System.in);

	System.out.println("Welcome to 'HDFC' bank");
		
	System.out.println("Enter the pin");
	
	int pin=sc.nextInt();
	
	float balance=10000f;
	
	if(pin==1234)
	{
	System.out.println("1-Deposite\n 2-Withdraw\n 3-check balance\n4-exit");
	
	      System.out.println("please choise");
	      int choice=sc.nextInt();
	   if(choice==1)
	    {
		System.out.println("Enter the deposite amount");
		int deposite=sc.nextInt();
		balance=balance+deposite ;    //use short hand operator balance=+deposite
	System.out.println("current balance is"+balance);
		}
	   else if(choice==2)
	   {
		   System.out.println("Enter Withdraw amount");
		   int withdraw=sc.nextInt();
		   balance-=withdraw;  //short hand balance=balance-withdraw
		  System.out.println("current balance"+balance); 
	   }   
	   else if(choice==3)
	   {
		   System.out.println("check balance"+balance);
		   
	   }
	   else if(choice==4)
	   {
            System.out.println("thanks for banking");
	   }
	}
	   else
	   { 
		   System.out.println("Enter pin is incorrect");
	   }
	   
		  
	
	
		
		
		
	}
	
	
      
}
