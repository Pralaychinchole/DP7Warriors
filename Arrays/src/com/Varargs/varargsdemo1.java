package com.Varargs;

public class varargsdemo1 {


		static void display(int ar[])
		{
			for(int i:ar)
			{
				System.out.println(i+" ");
			}
			
			System.out.println();
		}
		
		
		static void displayElement(int ...a)
		{
			for(int i:a)
			{
				System.out.println(i+" ");
			}
		}
		public static void main(String[] args) {
		
			int ar[]= {1,3,4,5,};
			display(ar);
			
			displayElement(1,2,3,5);
			displayElement(1,2,3,5,7,89,7);
			
			
			

		}

	}
