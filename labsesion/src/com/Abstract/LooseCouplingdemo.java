package com.Abstract;

abstract class car
{
	String name;
	int price;
	
	
	car()
	{
		
	}
	
	car(String name,int price)
	{
	  super();	
	  this.name=name;
	  this.price=price;
	  
	}
	
	void show()
	{
		
	}
			
}

class suzuki extends car
{
	int number;
	
	suzuki()
	{
		
	}
	
	
	public suzuki(int number,String name,int price)
	{
		super(name,price);
		this.number=number;
	}
	
	 void show()
	{
		System.out.println("It is a Suzuki car");
	}
	
}

class Tata extends car
{
	String colour;
	
	Tata()
	{
		
	}
	public Tata(String name,int price,String colour)
	{
		super(name,price);
		this.colour=colour;
	}
    
	void show()
	{
		System.out.println("it is tata car");
	}
}


public class LooseCouplingdemo {

	public static void main(String[] args) {

      
		car c1;
		
		c1=new suzuki();
		
		c1.show();
		c1=new Tata();
		c1.show();
	}

}
