package com.example1;

import java.util.Scanner;

public class Schoolgettersetter2 {

	static Scanner sc=new Scanner(System.in);
	
	static void enterdetail(Student s)
	{
		System.out.println("Enetr  studnet id");
		s.setId(sc.nextInt());
		
		System.out.println("Enetr  studnet name");
		s.setName(sc.next());
		
		System.out.println("Enetr  studnet marks");
		s.setMarks(sc.nextInt());
		
	}
	static void printdetail(Student str[])
	{
		System.out.println("----------------------");
		for (Student s:str)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
       Student st[]=new Student[3];
       
       for(int i=0;i<st.length;i++)
       {
    	   st[i]=new Student();
    	   enterdetail(st[i]);
       }
		
		printdetail(st);
	}

}
