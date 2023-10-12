package com.labinterface;

interface Grandfather
{
	
	void show();
}
interface f extends Grandfather
{
	
	default void show ()
	{
		System.out.println("father pay loan");
	}
}
interface m extends Grandfather
{
	 default void show()
	{
		System.out.println("mother pay loan");
	}
	
}

class child implements f,m
{

	@Override
	public void show()
	{
		f.super.show();
		m.super.show();
		System.out.println("child repay father and mother loan also");
		
	}
	
}



public class DiamondDemo {
	
	public static void main(String[] args) {
	
		Grandfather g1;
		
		g1=new child();
		g1.show();
		
		
	}

}
