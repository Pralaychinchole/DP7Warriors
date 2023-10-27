package com.exception2;

public class CheckedExceptionPropogation3 {


				void Method1()  throws ClassNotFoundException
				{
					
					 throw new ClassNotFoundException("Class error");	
					
					
					
				}
				void Method2() throws ClassNotFoundException
				{
					Method1();
				}
				void Method3() throws ClassNotFoundException 
				{
					
					Method2();
			     	
				}
				public static void main(String[] args) {
					
				  CheckedExceptionPropogation obj1=new CheckedExceptionPropogation();
				  
				  obj1.Method3();
				  
					
					
				}

			}


		
	