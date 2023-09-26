package com.looplogic;
import java.util.Scanner;
public class Additionofnum1to10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		
		while(true)
		{
			System.out.println("Enter the number");
			int num=sc.nextInt();
			sum=sum+num;
			if(num==0) {
				break;
			}
			
		}
		
		System.out.println("sum of number is"+sum);
		

	}

}
