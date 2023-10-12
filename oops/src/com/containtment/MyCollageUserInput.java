package com.containtment;
import java.util.Scanner;
public class MyCollageUserInput {

	static Scanner sc=new Scanner(System.in);
	
	void enterStudentDetail(Student s)
	{
		
		System.out.println("enter the student id");
		  s.setId(sc.nextInt());
		
		  System.out.println("enter the student name");
		  s.setName(sc.next());

		  s.setCourse(new Course());
		  
		  System.out.println("Enter Course id");
		  s.getCourse().setId(sc.nextInt());
		  
		  System.out.println("enter the name");
		  s.getCourse().setCourse(sc.next());
		  
		  System.out.println("enter the fees");
		  s.getCourse().setFees(sc.nextFloat());
		  
		    
		  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCollageUserInput collage=new MyCollageUserInput();
		Student s1=new Student();
		Student s2=new Student();
			collage.enterStudentDetail(s1);	
			collage.enterStudentDetail(s2);	

			System.out.println(s1);
			System.out.println(s2);
			
			
	}
	
	
	
	
}
