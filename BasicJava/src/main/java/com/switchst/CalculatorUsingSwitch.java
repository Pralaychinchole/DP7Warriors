package com.switchst;
import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1=sc.nextInt();
		
		System.out.println("Enter the number2");
		int num2=sc.nextInt();
		
		System.out.println("Enter the Arthmatic operator");
	char operator=sc.next().charAt(0);
	
	
	switch(operator)
	{
	case'+':System.out.println(num1+num2);
	break;
	case'-':System.out.println(num1-num2);
	break;
	case'*':System.out.println(num1*num2);
    break;
	case'%':System.out.println(num1%num2);
	break;
	}
	
			

	}

}
