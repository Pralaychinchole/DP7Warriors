package com.Covarient;


	class Test
	{
	   Number value;
	   
	   Number displayValue()
	   {
		   return value;
	   }
	   
	}   
class child extends Test
{
    Integer myVal;
    
    Integer displayValue()
    {
    	myVal=20;
    	return myVal;
    }

}
	


public class CovarientWrapperDemo2 {

	public static void main(String[] args) {
		
		First f= new First();
		f.value=89;
		System.out.println("Value is"+f.displayValue());
        
		Second s1= new Second();
		System.out.println("Value is"+(s1.displayValue()+10));

	}

}
