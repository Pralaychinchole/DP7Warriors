package com.Wrapper;

public class WrapperClassDemo {

	public static void main(String[] args) {

		// AutoBoxing
		//primitive to wrapper class
		//method:valueOf
		
		
		int num=23;
		Integer i=new Integer(45);
		
		//convert
		Integer j=Integer.valueOf(num);
		//conversion. auto
		
		Integer k=num;
		
		System.out.println(num+" "+i+" "+j+" "+k);
		
		//unboxing
		//wrapper to primitive
		
		//int value
		
		Float f1=new Float(23.4f);
		
		float f2= f1.floatValue();
		
		//unboxing-auto
		
		float f3=f1;
		System.out.println(f1+" "+f2+" "+f3);
		
		
		
	
		
	}

}
