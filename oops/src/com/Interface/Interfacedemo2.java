package com.Interface;

interface Taxpay
{
	String cname="india";
	void taxamount();

}
class Celebrity implements Taxpay
{
	String celebname;
	float income;
	
	public Celebrity()
	{
		
	}
	
	public Celebrity(String celebname,float income)
	{
	     super();
		this.celebname=celebname;
		this.income=income;
		
	}

	@Override
	public void taxamount() {
	//20%
		System.out.println("Celebrity amount of tax is "+(0.2*income));
		
	}
	
	
}
class Employee implements Taxpay
{
	String ename;
	float salary;
	public Employee()
	{
		super();
		
	}
	public Employee(String ename,float salary)
	{
		super();
		this.ename=ename;
		this.salary=salary;
		
		
	}
	
	@Override
	public void taxamount() {
		
		if (salary>500000) {
		System.out.println("amount of tax payble is"+(0.1*salary));
		}
		
		else {
			System.out.println("tax free salary");
		}
	}
	
	
}

public class Interfacedemo2 {

	public static void main(String[] args) {

		Celebrity c1= new Celebrity("Akshay",500000f);
		c1.taxamount();
		
        Employee e1=new Employee("pralay",1000000f);
        e1.taxamount();
		
		
	}

}
