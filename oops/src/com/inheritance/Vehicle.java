package com.inheritance;
//super class parent class
class car{
	
	String name;
	int price;
	String wheels;
	
	car(String name,int price,String wheels)
	{
		this.name=name;
		this.price=price;
		this.wheels=wheels;
		
	}
	void display()
	{
		System.out.println("car name"+name);
		System.out.println("price"+price);
		System.out.println("car wheels"+wheels);
		
	}
	// sub class chield class
}
	class Mahendra extends car
	{
		Mahendra(String name,int price,String wheels)
		{
			super(name,price,wheels);
			
		}
		
	}
	 
		

public class Vehicle {

	public static void main(String[] args) {
		
       Mahendra m=new Mahendra("mahendra",500000,"4");
		m.display();
		
	}

}
