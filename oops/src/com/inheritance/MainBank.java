package com.inheritance;

class Bank{
	
	String b_name;
	String address;
	int initialbalance=10000;
	float roi;
	
	Bank(String b_name,String address,int initialbalance,float roi)
	{
		this.b_name=b_name;
		this.address=address;
		this.initialbalance=initialbalance;
		this.roi=roi;
		
		
	}
	  void display()
	  {
		  System.out.println("bank name"+b_name);
		  System.out.println("bank address"+address);
		  System.out.println("initialbalance"+initialbalance);
		  System.out.println("rate of interest"+roi);
		  
		 
	  }
	  
	  void loan ()
	  {
		  System.out.println("loan provided");
	  }
}
	class Hdfc extends Bank
	{
		int initialbalance=20000;
		Hdfc(String b_name,String address,int initialbalance,float roi)
		{
			super(b_name,address,initialbalance,roi);
		}
		
		
		void loan()
  
		{
			super.loan();
			System.out.println("home loan");
		}
		
		void show()
		{
			System.out.println("initialbalance"+initialbalance);
		}
		
	}
	class ICICI extends Bank
	{
		ICICI(String b_name,String address,int initialbalance,float roi)
		
		{
			
			super(b_name,address,initialbalance,roi);
		}
		void loan()
		{
			System.out.println("Gold loan");
		}
		
	}
	
	

public class MainBank {

	public static void main(String[] args) {
		
		Hdfc h1=new Hdfc("Hdfc","pune",10000,9.8f);
		
		h1.display(); h1.loan();
		
		h1.show();
		
        ICICI i1=new ICICI ("ICICI","mumbai",12000,8.0f);
        i1.display();
       i1.loan();
	}

}
