package com.Static;

public class Staticdemo {

	int x=10;
	static int y=10;
	
	void show()
	{
		x++;
		System.out.println("x"+x);
		y++;
		System.out.println("y"+y);
	}
	
	void display()
	{
		int y=20;
		System.out.println(y);
		System.out.println(Staticdemo.y);
		
	}
	
	
	public static void main(String[]args) {
		
		Staticdemo s1=new Staticdemo();
		System.out.println("object s1");
		
		s1.show();
		
	}
}
