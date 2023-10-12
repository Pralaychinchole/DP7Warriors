package com.covarient;

class Person {
	int id;
	String name;
	int balance;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

class Paytm
{
	static Person display() 
	{
		Person p1=new Person();
		
		p1.setId(101);
		p1.setName("pralay");
		p1.setBalance(20000);
		
				
		return p1;
		
		
	}
	
}

public class Bank1 {

	public static void main(String[] args) {
		
		Person p1=Paytm.display();
		
		System.out.println(p1.getId()+p1.getBalance()+p1.getName());

	}

}
