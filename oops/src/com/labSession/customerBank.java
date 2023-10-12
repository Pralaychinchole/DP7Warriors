package com.labSession;
import java.util.Scanner;
public class customerBank {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner (System.in);
		
		Customer c1=new Customer();
		
		c1.setCId(12345);
        c1.setCname("pralay");
		c1.setAccno(987654321);
		c1.setBalance(10000);
		
		System.out.println(c1);
		System.out.println("You want to c or d");
		char ch=sc.next().charAt(0);
		
		System.out.println("Enter the amount you want");
		double amount=sc.nextDouble();
		
		if (ch=='c')
		{
	 double balance= c1.getBalance();
			balance=balance+amount;
			c1.getBalance();
		System.out.println("Balance is"+balance);
         }
		else if (ch=='d')
		{
			 double balance= c1.getBalance();
				balance=balance-amount;
				c1.getBalance();
			System.out.println("Balance is "+balance);
		}
		else
		{
			System.out.println("error");
		}
		
		
		
	}

}
