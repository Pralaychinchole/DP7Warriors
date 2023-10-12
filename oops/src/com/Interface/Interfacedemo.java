package com.Interface;

   interface Bakery
   {
	   
	   String bname="lets bake";
	   
	   void bake();
	  
			   
   }

   class Cake implements Bakery
   {
	   
	   public void bake()
	   {
		   System.out.println("we bake cakes:butter,ice,etc");
	   }
	   
	   
   }
class Biscuit implements Bakery
{

	
	public void bake() {
		
		System.out.println("we bake biscuit:almond,chocochips");
		
	}
	
	void minOrder()
	{
		System.out.println("min packing is 250g");
	}
	
}
		

public class Interfacedemo {

	public static void main(String[] args) {
		
		System.out.println("bakery name"+Bakery.bname);
        Cake c=new Cake();
        c.bake();
        
        Biscuit b=new Biscuit();
        b.bake();
        b.minOrder();
        
        
        Bakery b1;
        b1=new Biscuit();
        b1.bake();
        
     //   b1.minOrder()
        
	}

}
