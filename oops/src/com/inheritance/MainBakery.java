package com.inheritance;

class Bakery{
	
	void Baker()
	
	{	
		System.out.println("bakery");
	}
	void  type()
	{
		System.out.println("types of product");
	}
}
class Biscuit extends Bakery
	{
	 void Baker()
	 {
		 System.out.println("only Biscuit");
	 }
	void type()	
	{
		System.out.println("many type of biscuit:choclate ,orange ,etc");
		
	}
	}
   class Cake extends Bakery
   {
	  void Baker()
	   {
		  System.out.println("only cake");
	   }
	  void type()  
	  {
		  System.out.println("black forest ,white forest etc");
	  }
   }
   

public class MainBakery {

	public static void main(String[] args) {
		
       Bakery b1;
       b1=new Bakery();
       b1.Baker();
       b1.type();
       System.out.println("---------------------");
       b1=new Biscuit ();
       b1.Baker();
       b1.type();
	   System.out.println("-----------------------");	
	   b1=new Cake();
	   b1.Baker();
	   b1.type();
	}

}
