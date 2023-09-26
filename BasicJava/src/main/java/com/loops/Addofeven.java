package com.loops;
import java.util.Scanner;

public class Addofeven {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
	
	int count =0;
		
		int sum =0;
		for(int i=1;i<num;i++)
		{
	
			if(i%2==0)
			{
		sum=sum+i;
			count++;
			}
		
		}
		
		System.out.println("Sum of even number"+sum);
      System.out.println("count of even number"+count);
	}

}
