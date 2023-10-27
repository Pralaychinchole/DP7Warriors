package com.arrayList;

import java.util.ArrayList;

public class CommoNameInArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> m1=new ArrayList<>();
		
        m1.add("Shivam");
        m1.add("pralay");
        m1.add("suraj");
        m1.add("kailash");
        m1.add("vishal");
        
        
        ArrayList<String> m2=new ArrayList<>();
        
        m2.add("Shivam");
        m2.add("pratik");
        m2.add("aditya");
        m2.add("sumit");
        m2.add("vishal");
        
        m2.retainAll(m1);
          
//        ArrayList<String> CommonName=new ArrayList<>(m1);
          
        System.out.println("common name"+m2);
    
		
	}

}
