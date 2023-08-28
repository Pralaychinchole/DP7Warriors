package com.loops;

public class Print1to50 {

	public static void main(String[] args) {
		

		for(int  i=1;i<=50;i++)
		{
			if((i%3==0) && (i%5==0))
			{
				System.out.println("bye");
			}
			else if(i%3==0)
			{
				System.out.println("Hello");
			}
			else if(i%5==0)
			{
				System.out.println("Welcome");
			
			}
			else
			   
			{
				System.out.println(i);
			}
		
			
			
			
			
		}
		
		
		
		
		

	}

}
