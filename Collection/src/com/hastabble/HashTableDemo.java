package com.hastabble;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
	Hashtable<Integer,String> ht=new Hashtable<>();
	
	//ht.put(null, "Anonomous"); no null key and null value
	
	ht.put(1,"pralay");
	ht.put(2,"aniket");
	ht.put(3,"hrushi");
	ht.put(4,"shivam");
	
	System.out.println(ht.put(2,"vishal"));
	System.out.println(ht.put(2, "suraj"));
	
	System.out.println(ht);
	
	
	
	}

} 
