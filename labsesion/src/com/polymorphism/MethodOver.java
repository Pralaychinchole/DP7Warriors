package com.polymorphism;

public class MethodOver {
     
		
		 public void printParam(long l,double d)
		  {
		    System.out.println("long+double: "+(l+d));
		  }
		  public void printParam(double i,long i1)
		  {
		    System.out.println("double + long"+(i+i1));
		  }

		  

		public static void main(String[] args) {
			 MethodOver m=new  MethodOver();
			m.printParam(10L,20d);
			m.printParam(50d,10);
			
     		}

	}




