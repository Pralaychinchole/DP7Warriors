package com.Stringlogical;

public class StringIntern {

	public static void main(String[] args) {
		
	  String s1="java";
	  
	 String s2=new String("java");
		
		s2=s2.intern();
		
	// save the memory
		
		// eases comparison ,we can compare with==
	}

}
