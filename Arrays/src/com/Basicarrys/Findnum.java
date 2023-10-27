package com.Basicarrys;
import java.util.Scanner;
public class Findnum {

	static void findnum(int ar[],int num)
	{
		boolean isPresent =false;
		for (int i=0;i<ar.length;i++)
		{
			if (ar[i]==num) 
			{
				isPresent =true;
				System.out.println(num+"is Present in array at position"+(i+1));
				
			}
		}
	if(!isPresent)
	{
		System.out.println(num+"is not present in array");
	}
		
		
	}
	
	
	public static void main(String[] args) {
		    
		int arr[]= {2,3,6,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for search element");
		int num=sc.nextInt();
		
		findnum(arr,num);

	}

}
