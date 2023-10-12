package com.accesssmodifier;

class Employee
{
	void display()
	{
	System.out.println("In default accessmodifire ");
	}
	
}
 class Manager extends Employee
 {
	 public void display()
	 {
		 System.out.println("public Access");
	 }
   
	 
 }
class programmer extends Employee
{
	 protected void diplay()
	 {
		 System.out.println("protected access");
	 }
}


public class Accessdemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.display();
         
		Manager m1=new Manager();
		
		m1.display();
		
		programmer p1=new programmer();
		p1.diplay();
	}

}
