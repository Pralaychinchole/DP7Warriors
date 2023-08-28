package ifelse;

import java.util.Scanner;

public class ASCII1 {
    
	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("It is a char");
		
		char ch=sc.next().charAt(0);
		
	
	if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z')
	{
	System.out.println("It is a character");	
	}
	
	else if
   (ch>='0' && ch<='9') 
	{
		System.out.println("It is a digit");
	}
	else
	
	{
		System.out.println("It is symbol");
	}
	
			
			
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
