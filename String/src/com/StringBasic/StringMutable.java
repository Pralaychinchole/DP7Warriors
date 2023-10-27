package com.StringBasic;

public class StringMutable {

	public static void main(String[] args) {
		
		String s1="java";
		
		System.out.println(s1.hashCode());
          s1="corejava";
          
          System.out.println(s1.hashCode());
          System.out.println(s1);
          
          
          String s2="shivam";
          System.out.println(s2.hashCode());
          s2.concat("patil");//shivam concat patil
          System.out.println(s2.hashCode());
          System.out.println(s2);
          
          String s3="shivam";
          System.out.println(s3.hashCode());
          s3=s3.concat("patil");
          System.out.println(s3.hashCode());
          System.out.println(s3);
          
          
          String s4="shivampatil";
          System.out.println(s4.hashCode());
          
          
	}

}
