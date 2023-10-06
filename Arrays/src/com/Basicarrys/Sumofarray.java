package com.Basicarrys;
import java.util.Arrays;
import java.util.Scanner;
public class Sumofarray {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int arr[]=new int[5];
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value:");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
			
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum is:"+sum);
		

float ar[]= {25.6f,56.9f,35.7f,47.8f};
		
		float sumj=0f;
		
		for(int j=0;j<ar.length;j++)
		{
			sumj+=ar[j];
		}	
		System.out.println("\nFloat sum is :"+sumj);	
	}


}