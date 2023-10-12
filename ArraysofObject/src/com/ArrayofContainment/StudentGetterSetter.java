package com.ArrayofContainment;

import java.util.Scanner;

public class StudentGetterSetter {

	static Scanner sc=new Scanner(System.in);
	
	static void enterdetails(Student s)
	{ 
		
		
		System.out.println("Enter student did");
		s.setId(sc.nextInt());
		
		System.out.println("Enter student name ");
		s.setName(sc.next());
		
		//2nd WAY
		
		s.setCourse(new Course());
        
		System.out.println("Enter course id");
		
		s.getId();
		

	}
	
	public static void main(String[] args) {
            
		Student stud[]=new Student[3];
		
		stud[0]=new Student();
		

	}

}
