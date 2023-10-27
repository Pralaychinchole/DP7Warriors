package com.String;

   //pralay chinchole =p.chinchole

public class InitialName {

	static void Initially(String str)
	{
		String s[]=str.split("\\s");
		
		String st="";
		for(int i=0;i<s.length;i++)
		{
			if(i==s.length-1)
			{
				st=st+s[i];
			}
			else
			{
			char ch=s[i].charAt(0);
			  st=st+ch+".";
			}
		}
		System.out.println(st);
		
	}
	
	
	public static void main(String[] args) {
		
		String str="sonal kishor pawar";

		Initially(str);
	}

}
