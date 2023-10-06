package com.Varargs;

public class varargsRule {

	
	//	rule 1:There can be only 1 varargs
		
	//	static void printMe(int ...a,String ...s)
	static void printMe(String ...s)
		{
			
		}
		
	//	Rule 2: It should be last argument in the method
		//static void printMe(int num,String ...s,String ...s)
	static void printMe(int num,String ...s)
		{
			System.out.println(num);
			
			String[] str;
			for(String s1:str)
			{
				System.out.println(s1);
			}
		
		}


		public static void main(String[] args) {
			
		}

	
	
	
	