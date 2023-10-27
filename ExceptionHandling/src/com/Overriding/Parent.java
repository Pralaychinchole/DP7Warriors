package com.Overriding;

public class Parent {

	
	int data=45;
	
	
	void printdata()
	{
		
		
	}
	
}
class child extends Parent
{
	int val=0;
	
	void prindata() throws ArithmeticException
	{
		if(val==0)
		{
			throw new ArithmeticException();
			
		}
		System.out.println(data/val);
	}
	
	public class checkedOverriding{
		
	}
		
		
	}
