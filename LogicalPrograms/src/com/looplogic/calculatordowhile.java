package com.looplogic;

import java.util.Scanner;

public class calculatordowhile {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	char ch1;
	
	do {
		System.out.println("Enter the number1");
		int num1=sc.nextInt();
		
		System.out.println("Enter the number2");
		int num2=sc.nextInt();
		
		System.out.println("Enter the choice+,-,/,*");
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
	   default:System.out.println("Enter valid operator"); 
	}
	System.out.println("Do you want to continue press yes or no");
	
	ch1=sc.next().charAt(0);
	}		
      while(ch1!='n'); 
               
	
	}

}
