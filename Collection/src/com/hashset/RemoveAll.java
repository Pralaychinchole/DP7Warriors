package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveAll {

	public static void main(String[] args) {
		
      ArrayList<Integer> a1=new ArrayList<>();
		
		a1.add(22);
		a1.add(34);
		a1.add(45);
		a1.add(25);
		a1.add(56);
		a1.add(22);
		a1.add(56);
		System.out.println(a1);
		
		System.out.println("------------------");
	
		HashSet<Integer> s1=new HashSet<>(a1);

		System.out.println(s1);
	}

}
