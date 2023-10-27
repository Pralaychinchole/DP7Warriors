package com.StringAssignment;

public class FindSecondWord {

	static void findSecondWord(String str)
	{
		char ch[]=str.toCharArray();
		
		for (int i=0;i<ch.length;i++)
		{
			System.out.println("the Second letter is:"+ch[1]);
			break;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String str="java programming";
		
		findSecondWord(str);
	}

}
