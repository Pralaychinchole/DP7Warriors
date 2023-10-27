package com.CustomException;

public class InvalidNameException extends RuntimeException  
    {

	
	public InvalidNameException()
	{
	    super();	
	}
	public InvalidNameException(String Message)
	{
		super(Message);
	}
	
}
