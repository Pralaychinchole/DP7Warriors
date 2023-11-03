package com.hashset;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet<String> s1=new HashSet<>();
		
		s1.add("vishal");
		s1.add("Hrushi");
		//System.out.println(s1.add("Mayur"));
		s1.add("Kailash");
		s1.add("vishal");
		//System.out.println(s1.add("Mayur"));
		s1.add("Shivam");
		s1.add(null);
		
		System.out.println(s1);
		
		HashSet<String> s2=new HashSet<>();
		
		s2.add("kailash");
		s2.add("Girish");
		s2.add("Anuj");

		System.out.println(s2);
		
		//Mathmatical Operation
		
		//union
		
		
		//differance
		s1.remove(s2);
		System.out.println(s1);
		
		//insertion
		s1.retainAll(s2);
		System.out.println(s1);
		
	}

}
