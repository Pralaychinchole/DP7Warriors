package com.arraylab;

public class Maxxcharacter {

	static void findmax(int ar[])
	{
		char max= Character.MIN_VALUE;
				
		for (int i=0;i<ar.length;i++)
		{
			if (ar[i]>max)
			{
				max=(char) ar[i];
			}
		}
		System.out.println("max digit is:"+max);
	}
	
	public static void main(String[] args) {
		
		int ar[]= {'a','g','c','d'};
		
		findmax(ar);

	}

}
