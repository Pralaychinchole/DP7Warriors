package com.words;

import java.util.Arrays;

public class DivideString2 {
			
			static void divideString(String st, int noOfc)
			{
				int len= st.length();//12
				
				// number of substring
				int n= len/noOfc;
				
				if(len% noOfc !=0)
				{
					
					System.out.println("We can not divide String");
					
				}
				
				else {
				
				String spltstr[]= new String[n];
				
				int index=0;
				
				for(int i=0;i<len;i+=noOfc)
				{
				   spltstr[index]= st.substring(i,i+noOfc);	
				   index++;
				}
				
				System.out.println(Arrays.toString(spltstr));
				
				
				}
				}
			
			public static void main(String[] args) {
				
			    String arr[]= {"I","am","very","smart"};
				
				String s1= String.join("", arr);
				
				//String s1="Iamverysmart";
				
				System.out.println(s1);
				
				int noOfChars=5;
				
				divideString(s1, noOfChars);
				
				
			}

		}


