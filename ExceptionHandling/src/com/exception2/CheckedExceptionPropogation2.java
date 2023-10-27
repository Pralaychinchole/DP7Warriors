package com.exception2;

public class CheckedExceptionPropogation2 {

		
			void Method1()  throws ClassNotFoundException
			{
				
				 throw new ClassNotFoundException("Class error");	
				
				
				
			}
			void Method2() throws ClassNotFoundException
			{
				Method1();
			}
			void Method3() 
			{
				try
				{
				Method2();
		     	}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			public static void main(String[] args) {
				
			  CheckedExceptionPropogation obj1=new CheckedExceptionPropogation();
			  
			  obj1.Method3();
			  
				
				
			}

		}


	
