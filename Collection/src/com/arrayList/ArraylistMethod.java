package com.arrayList;

import java.util.ArrayList;

public class ArraylistMethod {
//	Q3. Create an arraylist of Integer and implement following methods
  //  1. get method
    //2. set method
    //3. retainAll
    //4. removeAll
    //5. add method
	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<>();
		
		a1.add(23);
		a1.add(34);
		a1.add(32);
		a1.add(34);
		a1.add(36);
		
		ArrayList<Integer> a2=new ArrayList<>();
		
		a2.add(23);
		a2.add(99);
		a2.add(98);
		a2.add(93);
		a2.add(45);
		
		
		
		//a1.get(4);
		System.out.println(a1.get(4));//get method onlu print 4th index 
		
	   a1.add(2, 43);
		
	    System.out.println(a1);//add method
	    
	    a1.set(1, 32);
	 
	    System.out.println(a1);
	    
	    
	    a2.retainAll(a1);
	    {
	    	System.out.println(a2);//common element share 
	    }
	    
	   a2.removeAll(a2); 
	   System.out.println(a2);//remove all element
	   
	    
	}

}
