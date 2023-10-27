package com.words;

public class ReverseWordByWord {

	static void reverseWord(String s)
	{
		String splitst[]=s.split("\\s");
		
		String revest="";
		
		for (int i=0;i<splitst.length;i++)
		{
			for (int j=splitst[i].length()-1;j>=0;j--)
			{
				revest =revest+splitst[i].charAt(j);			
				
			}
			
			  revest=revest+" ";
			
		     } 
		
		System.out.println("after:"+revest);
		
	}
	
	public static void main(String[] args) {
		 
		String s=" i like to learn java";
		
		reverseWord(s);

	}

}
