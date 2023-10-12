package com.containtment;

public class Mycollege {

	public static void main(String[] args) {
		
		Course c1=new Course(1,"Java",20000f);
		Course c2=new Course(2,"python",20000f);
		Course c3=new Course(1,".net",20000f);
		
		
		Student s1=new Student(1,"Sarang",c1);
		Student s2=new Student(2,"sumit",c2);
		Student s3=new Student(3,"pratik",c3);
		Student s4=new Student(4,"anuj",c2);
		Student s5=new Student(5,"kailas",c1);
		
     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s3);
     System.out.println(s4);
     System.out.println(s5);
    
		
		
		
	}

}
