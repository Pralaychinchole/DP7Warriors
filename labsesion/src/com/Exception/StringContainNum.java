package com.Exception;

public class StringContainNum {

	public static void main(String[] args) {

		String[] sarr = { "java", "c", "88angular", "python" };

		for (int i = 0; i < sarr.length; i++) 
		{

			for (int j = 0; j < sarr[i].length(); j++) 
			{
				try 
				{
					
					if (sarr[i].charAt(j) >= '0' && sarr[i].charAt(j) <='9')
					{
						throw new InvalidStringException("String contain the number");

					}
					System.out.println(sarr[i]);
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}
				break;

			}
			

			
		}
	}
}
