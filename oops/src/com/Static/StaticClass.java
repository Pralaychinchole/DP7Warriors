package com.Static;

public class StaticClass {

	int x=10;
	static int y=20;
	 
	
	void instaceMethod()
	{
		System.out.println("x"+x);
		System.out.println("y"+y);
	}
	
	static void staticMethod()
	{
		//System.out.println("x"+x);
		System.out.println("y"+y);
	}
	

	
	public static void main(String[] args) {
		

		StaticClass s1=new StaticClass();
		
		s1.instaceMethod();
		
		staticMethod();
	}

}
