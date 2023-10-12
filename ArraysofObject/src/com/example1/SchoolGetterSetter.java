package com.example1;
import java .util.Scanner;
public class SchoolGetterSetter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Student st[]=new Student[3];
   
		for(int i=0;i<st.length;i++)
		{
			st[i]=new Student();  //object create student
			
			System.out.println("enter stundent id");
			  //int id=sc.nextInt();
			  //or
			st[i].setId(sc.nextInt());
			
			System.out.println("enter the name");
			st[i].setName(sc.next());
			
			System.out.println("enter the marks");
			st[i].setMarks(sc.nextInt());
			
		}
		
		System.out.println("===================================");
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		

	}

}
