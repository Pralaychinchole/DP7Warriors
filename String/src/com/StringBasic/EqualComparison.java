package com.StringBasic;

public class EqualComparison {

	public static void main(String[] args) {
		
		String s1="java";
		String s2="java";
		
		System.out.println(s1==s1);
        System.out.println(s1.equals(s2));
        
        System.out.println("__________________________________________");
        
        String s3=new String ("hii");
        String s4=new String ("hii");
      
        
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        
	}

}
