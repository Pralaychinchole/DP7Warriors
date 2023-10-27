package com.Exception;

public class ExceptionDemo2 {

    static void length(String[] str)
    {
    	for (int i=0;i<str.length;i++)
    	{ try {
    		if(str[i].length()<3)
    		{
    			throw new InvalidStringException("the  char length should be more then 3");
    		}
    		System.out.println(str[i]);
    	}	
    		catch(Exception e)
    		{
    			System.out.println(e);
    		}
    	}	
    		
    	}
    	
   
	public static void main(String[] args) {
		
		String Str[]= {"c","java","angular","python"};
		
		length(Str);
	 
	}

}
