package com.arraylab;

import java.util.Arrays;

public class CharacterrotateusingAscii {

	
	public static void main(String[] args) {
		
	char ch[]= {'a','b','c','y','z'};
	
	for (int i=0;i<ch.length;i++)
	{
		if (ch[i]<='c')
		{                       
			ch[i]+=2;
			
		}
		else if (ch[i]>='y')
			{
					ch[i]-=24;   //using ascii value  
					
			}
		
	}System.out.println(Arrays.toString(ch));

	}

}
