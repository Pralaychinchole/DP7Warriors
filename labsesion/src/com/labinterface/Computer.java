package com.labinterface;

interface Keyboard
{
	void display();
	
}
class Dell implements Keyboard
{

	@Override
	public void display() {
		System.out.println("It is dell keyboard");
		
	}
	
}
class Lenova implements Keyboard
{

	@Override
	public void display() {
		
		System.out.println("it is a hp keyboard");
	}
	
	
}

class Key 
{

	
	public void display(Keyboard k) {
	
		k.display();
		
	}
	
	
}
public class Computer {

	public static void main(String[] args) {
	
		Key k;
		k=new Key();
		Dell d=new Dell();
	    
		Lenova l=new Lenova();
          
		d.display();
		l.display();
	}

}
