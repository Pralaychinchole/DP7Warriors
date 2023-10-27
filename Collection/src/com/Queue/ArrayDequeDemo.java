package com.Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
	    ArrayDeque<Float> adq= new ArrayDeque<Float>();
	    
	  adq.add(89.4f);
	  adq.offerFirst(78.3f);
	  adq.addFirst( 43.5f);
	  
	  System.out.println(adq);
	  
	  
	  System.out.println(adq.peekFirst());
	  System.out.println(adq.peekLast());
	  
	  System.out.println(adq.pollLast());
	  System.out.println(adq.removeFirst());
	  
	  adq.push(89.3f);//add
	  
	  System.out.println(adq);

	}

}
