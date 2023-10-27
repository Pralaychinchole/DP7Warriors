package com.hashmap;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<String,Double> hm=new HashMap<>();
		
          hm.put("kailash", 89.6);
          hm.put(null, 0.0);
          System.out.println(hm.put(null, 100.0));//replaced 0with 100
		  hm.put("pralay", 67.8);
		  hm.put("vishal", 74.8);
		  hm.put("shivam", 87.8);
		  hm.put("hrushi", 69.8);
          
          System.out.println(hm);
          
          
          System.out.println("size"+hm.size());
          
          //get
          System.out.println("marsks of rushi"+hm.get("vishal"));
          
          System.out.println("pralay"+hm.containsKey("pralay"));
	      
          System.out.println("vishal"+hm.containsKey("vishal"));
	
          System.out.println("69.8"+hm.containsValue(69.8));//69.8
          //putIfabsent
          
          System.out.println(hm.putIfAbsent("shivam", 87.8));//87.8
	     
          System.out.println(hm);
          
          System.out.println(hm.putIfAbsent("pralay", 67.8));
          
          System.out.println(hm);
	
	}

}
