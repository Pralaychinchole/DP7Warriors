package com.constructor;

class Student {

	  private String name;
	  private int age;
	private int id;
	//Student(int sid,String sname,int age)
	
	
	
	
	//default constructor
	Student()
	{
		
	}
	
	//parameterized constructor
	Student(int id,String name,int age )
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	 public int getId()
	 {
		 return id;
	 }
	 public void setId(int id)
	 {
		this. id=id; 
	 }
	 public String getName()
	 {
		 return name;
	 }
	
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public int getAge()
	 {
		 return age;
	 }
	 public void setAge(int age)
	 {
		 this .age=age;
	 }
	     
	 
	 public String  toString()
	 {
		 return id+" "+name+" "+age;
	 }
	 
} 
		
	public class Paraconstructor
	{
	
		public static void main(String[]args)
		{
			Student s1=new Student(101, "Aniket",23);
			Student s2=new Student(101, "vikas",23);
			Student s3=new Student(101, "suraj",23);
			
			Student s4=new Student();
			s4.setId(104);
			s4.setName("shivam");
			s4.setAge(29);
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			
			
			
		}
		
		
	}
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	

