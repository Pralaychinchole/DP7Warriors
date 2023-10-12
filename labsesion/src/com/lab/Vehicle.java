package com.lab;

public class Vehicle{
	 
	int id;
	String name;
	float price;
	
	
	Vehicle(int id,String name,float price)
	
	{
		this .id=id;
		this.name=name;
		this.price=price;
		
	}
	
	void show () {
		System.out.println("vehicle id"+id);
		System.out.println("vehicle name"+name);
		System.out.println("vehicle price"+price);

	
	}


 public static void main(String[]args) {
	 
	 Vehicle v1=new Vehicle(200,"Scorpio",120000);
	 
	 Vehicle v2=new Vehicle(203,"Baleno",100000);
	 
	                
	 v1.show();
	 v2.show();
 }	 
	 
}

