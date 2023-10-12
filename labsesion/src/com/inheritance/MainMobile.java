package com.inheritance;

 class Mobile
 {
	 int id;
	 String name;
	 int price;
	 
	 Mobile(int id,String name,int price)
	 {
		 this.id=id;
		 this.name=name;
		 this.price=price;
		 
	 }
	void display() 
	{
		System.out.println("id"+id);
		System.out.println("Mobile name"+name);
		System.out.println("Mobile price"+price);
		
	}
 

 void check(Mobile m)
 {
	 if(m.price>25000)
	 {
		 System.out.println("price"+price+   "name "+name);
	 }
	
 }
		 
 }
public class MainMobile {

	
	public static void main(String[] args) {
		
		Mobile m1=new Mobile(1,"samsung",27000);
		
        Mobile m2=new Mobile(2,"Vivo",23000);
        
        Mobile m3=new Mobile (3,"redmi",29000);
        
		m1.check(m1);
		m2.check(m2);
		m3.check(m3);
	}

}
