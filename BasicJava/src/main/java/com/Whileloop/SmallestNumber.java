package com.Whileloop;

public class SmallestNumber {

	public static void main(String[] args) {
		 int num=2345;
	   
	     int rem1=num%10;  
	      num/=10;
	     
	      while(num!=0) {
	    	  
	    	  int rem2=num%10;
	    	  if (rem2<rem1) {
	    		  
	    		  rem1=rem2;
	    	  }
	    	  
	    	  num=num/10;
	    	  
	      }
	   
   System.out.println(rem1+"is minimum");


	}

}
