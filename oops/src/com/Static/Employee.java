package com.Static;

class Employee1 {

	 
	private int id;
	private String name;
	private float salary;
	 private static String cname;
	static int icount=0;
	
	static
	{
		cname="Tata";
		
	}
	{
		icount++;
	}
	static void changeName(String bname)
	{
		cname=bname;
	}
	
	Employee1()
	{
		
		
	}

	Employee1(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		 
		 		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static String getCname() {
		return cname;
	}

	public static void setCname(String cname) {
		Employee1.cname = cname;
	}


	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary+" cname="+cname;
	}

	
}
	
public class Employee
{
	public static void main(String[] args) {
	
		Employee1 e1=new Employee1(101,"aniket",60000);
		Employee1 e2=new Employee1(102,"hrushi",55000);
		Employee1 e3=new Employee1(101,"shivam",555555);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		Employee1.changeName("TCS");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println("Number of Employee Working in Company:"+Employee1.icount);
	}
	
}

