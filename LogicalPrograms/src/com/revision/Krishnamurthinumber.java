package com.revision;
import java.util.Scanner;
public class Krishnamurthinumber {

	
	static void krishnamuthy(int num)
	{
		int original =num;
		
		int fact=1;
		int sum=0;
     	while(num!=0) 
	    {	
		int r=num%10;
		for(int i=1;i<=r;i++)
		{
			fact=fact*i;
		}
		
	    num/=10;
	 }
		sum=sum+fact;
		
		if (original==sum)
		{System.out.println(original+"it is a krishnamurthy number");
		}
	
		else 
			System.out.println(original+" is not a krishnamurthy number");
		
	}

	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		
		krishnamuthy(n);
	}

}
