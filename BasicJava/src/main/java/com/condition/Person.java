package com.condition;

import java.util.Scanner;

public class Person {
	
	public static void main(String[]args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter the name");
	
	String name= sc.next();
	
	System.out.println("enter the height");
	 
	 Double height= sc.nextDouble();
	 
     System.out.println("enter the age");
	 
	int age= sc.nextInt();
	
	System.out.println("enter the gender");
	
	char gender= sc.next().charAt(0);
	
	System.out.println("name of person"+name);
	
	System.out.println("the age person"+age);
	
	System.out.println("the gender person"+gender);
	
	System.out.println("the person height"+height);
	
}
     

}
