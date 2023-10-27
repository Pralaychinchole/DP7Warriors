package com.exception2;

public class UnCheckedException {

	void Method1()
	{
	   int data=	50/0;
		
	}
	void Method2()
	{
	   Method1();	
	}
	void Method3()
	{try {
		Method2();
	}
	catch(Exception e)
	{
		System.out.println("In method 3"+e);
	}
	}
	public static void main(String[] args) {
		
		UnCheckedException obj1=new UnCheckedException();
		
	obj1.Method3();
		
		
	}

}
