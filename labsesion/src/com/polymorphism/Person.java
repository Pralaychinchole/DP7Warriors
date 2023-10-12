package com.polymorphism;

public class Person {

	void activity(String name,String role)
	{
		System.out.println("the name of person is"+name);
		System.out.println("the roll in home is "+role);
	}
	void activity(int salary,int ysalary)
	{
		System.out.println("the monthly salary is"+salary);
		ysalary=(salary*12);
		System.out.println("the yearly package is"+ysalary);
	}
	String activity(String game)
	{
		return game;
	}
	
	
	public static void main(String[] args) {
	
		Person p1=new Person();
		p1.activity("shivam","Father");
		
		Person p2=new Person();
		p2.activity(12000,144000);
		
		Person p3=new Person();
		String s=p3.activity("chess");
		System.out.println("the shivam is playing " +s);

	}

}
