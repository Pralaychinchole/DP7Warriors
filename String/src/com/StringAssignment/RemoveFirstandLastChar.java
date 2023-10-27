package com.StringAssignment;

public class RemoveFirstandLastChar {

	static void removeChar(String str)
	{
		char ch[]=str.toCharArray();
		
		
		for (int i=0;i<ch.length-1;i++)
		{
			System.out.print(""+ch[i]+"");
		}
		
	}
	
	public static void main(String[] args) {

		String str="hello word";
		
		removeChar(str);
	}

}
