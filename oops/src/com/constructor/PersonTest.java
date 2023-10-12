package com.constructor;

class Person2 {

	private int id ;
	private String name;
	private int age;
	
	
  public Person2()
	{
		
		id=100;
		name="user";
		age=21;
				
	}
   public String toString()
   {
	   return id+" "+name+" "+age;
   }
}
	public class PersonTest
	{
	public static void main(String[] args) 
	{
		Person2 p=new Person2();
		System.out.println(p);

	}
	
}
