package com.exception2;

public class CheckedExceptionPropogation {

	
	void Method1()
	{
		try 
		{
		 throw new ClassNotFoundException("Class error");	
		}
		catch(Exception e)
		{
			System.out.println("In Method 1"+e);
		}
		
		
	}
	void Method2()
	{
		Method1();
	}
	void Method3()
	{
		Method2();
	}
	
	public static void main(String[] args) {
		
	  CheckedExceptionPropogation obj1=new CheckedExceptionPropogation();
	  
	  obj1.Method3();
	  
		
		
	}

}
