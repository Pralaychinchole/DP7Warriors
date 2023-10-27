package com.words;

public class ReveseMiddle {


		static void reverseWord(String s)
		{
			String splitst[]=s.split("\\s");
			
			String revest="";
			
			revest=revest+splitst[0]+" ";
			
			for (int i=1;i<splitst.length-1;i++)
			{
				for (int j=splitst[i].length()-1;j>=0;j--)
				{
					revest =revest+splitst[i].charAt(j);			
					
				}
				
				  revest=revest+" ";
				
			     } 
			
			revest=revest+splitst[splitst.length-1];
			System.out.println("after:"+revest);
			
		}
		
		public static void main(String[] args) {
			 
			String s=" i like to learn java";
			
			reverseWord(s);

		}

	}
