package com.lab;

public class Student {

	private int id;
	private String name;
	
	
	Student(int id,String name){
		
		this.id=id;
		this.name=name;
		
	}
	void display()
	{    
		this.show();
		System.out.println(id);
		System.out.println(name);
	}
	
	void show ()
	{
		System.out.println("student info.");
	}
	
	
	public static void main(String[]args) {
		
		Student s1=new Student(101,"pralay");
		Student s2=new Student(102,"aniket");
		
	
		s1.display();
		s2.display();
		
	}
	
	
	
	
}
