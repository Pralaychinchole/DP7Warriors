package com.condition;

import java.util.Scanner;

public class Cyclinder {

	public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the radius of Cyclinder");
	
	Double radius= sc.nextDouble();
	
	System.out.println("Enter the height of Cylinder");
	
	Double Height=sc.nextDouble();
	
	Double volume= Math.PI*radius*radius*Height;
	
	System.out.println("volume of cyclinder"+volume);
	
	sc.close();
	
	
	}
}
