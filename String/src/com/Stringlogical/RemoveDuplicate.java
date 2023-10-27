package com.Stringlogical;

public class RemoveDuplicate {

	static String remduplicate(String str)
	{
		for (int i=0;i<str.length();i++)
		{
			for (int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)) 
				{
				str=str.replace(str.charAt(j),'\0');
					
				}
				
				
			}
			
			
		}
		
		return str;
		
	}
	
	public static void main(String[] args) {
	
		String str="hello";
		
		remduplicate(str);
		
		
		
	}

}
