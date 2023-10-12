package com.Overloading;

class Person
{
	void show()
	{
		System.out.println("i m person");
	}
	
}

class Student extends Person
{
	void show()
	{
		System.out.println("i m student");
	}
	void hobby()
	{
		System.out.println("sport");
	}
}
class Employee extends Person
{
	void show()
	{
		System.out.println("Employee");		
	}
	
	void designation()
	{
		System.out.println("developer");
	}
	
}
public class MainPerson {

	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.show();
		
		Student s1=new Student();
		s1.show();
		s1.hobby();
		
		Employee e1=new Employee();
		e1.show();
		e1.designation();		
	}

}
