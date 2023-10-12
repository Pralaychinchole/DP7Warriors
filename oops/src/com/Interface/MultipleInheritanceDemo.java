package com.Interface;


//single abstract method only

@FunctionalInterface
interface Showable
{	
void display();

}

interface PrintMe
{
void display();	

}

class Demo implements Showable,PrintMe
{

	@Override
	public void display() {
	
		System.out.println("welcome");
		
	}
	

}

public class MultipleInheritanceDemo {
	
	public static void main(String[] args) {
			
	Demo d1= new Demo();
	d1.display();
	}
}
