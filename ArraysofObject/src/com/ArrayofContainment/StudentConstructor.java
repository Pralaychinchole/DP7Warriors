package com.ArrayofContainment;

public class StudentConstructor {

	public static void main(String[] args) {
		
		Course c1=new Course(101,"java",4500f);
		Course c2=new Course(102,"paython",55000f);
		
		Student stud[]=new Student[4];
		
		stud[0]=new Student(1,"pralay",c1);
		stud[1]=new Student(2,"hrushi",c2);
		stud[2]=new Student(3,"shivam",c1);
	//or	stud[3]=new Student(1,"pralay",c1);
		
       stud[3]=new Student();
       stud[3].setId(4);
       stud[3].setName("aniket");
	   stud[3].setCourse(c2);
	   
	   for(Student s:stud)
	   {
		   System.out.println(s);
	   }
	   
	}

}
