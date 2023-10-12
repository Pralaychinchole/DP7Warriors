package com.covarient;

class loan
{
	String s="All types of loan provided";
}
class Homeloan extends loan
{
	
	
}
class Educationloan extends loan
{
	
}
class carloan extends loan
{
	
}

 class Bank 
{
        loan provideloan()
        {
		return new loan();
        }
	
}

class Hdfc extends Bank
{
	carloan provideloan()
	{System.out.println("car loan provide");
		return new carloan();
	}
	
}
class Icici extends Bank
{
	Homeloan provideloan()
	{
		System.out.println("Home loan can provide");
		return new Homeloan();
	}
	
}
class Baroda extends Bank
{
	Educationloan provideloan() 
	{System.out.println();
		return new Educationloan();
	}
}

public class MainBank {

	public static void main(String[] args) {
		
		Bank b1;
		
		b1=new Hdfc();
		
	  loan l= b1.provideloan();
	  System.out.println(l.s);
		//System.out.println(b1);

	}

}
