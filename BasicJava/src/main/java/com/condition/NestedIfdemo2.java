package com.condition;
import java.util.Scanner;

public class NestedIfdemo2 {
	
	
	public static void main(String[]args) {
	
		
		//per>65: collage addmision
		//per>80 :addmision sciene and commerse
		//per<80: comm.stream
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the per");
		float per=sc.nextFloat();
		
		if(per>65)
		{
			System.out.println("Eligible for admission");
			if(per>80)
			{
				System.out.println("Admission sci.&comm.");
			}
			else
			{
			     System.out.println("can opt comm.");
			}
		}
		else
		 {
			System.out.println("not eligible for collage");
		 }
		
			
			
			
			
	}
}	

	


