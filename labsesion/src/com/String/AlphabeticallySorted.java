package com.String;

import java.util.Scanner;

public class AlphabeticallySorted {

	static void sortAlphabetical(String str)
	{
		boolean flag=true;
		
	   char ch[]=str.toCharArray();
	   
	   for(int i=0;i<ch.length;i++)
	   {
		   for (int j=i+1;j<ch.length;j++)
		   {
			   if(ch[i]>ch[j])
			   {
				   flag=false;   
			   }   
		   }
	   }
	if(flag==true)
	{
		System.out.println("String is alphabetical sorted");
		
	}
	else
	{
		System.out.println("Not alphabetical sorted");
	}
		
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter a word");
		  
		String str=sc.next();
		
		sortAlphabetical(str);
		
	}

}
