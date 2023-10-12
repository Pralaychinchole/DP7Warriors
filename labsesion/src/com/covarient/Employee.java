package com.covarient;

class Employee1
{
	int id;
	String name;
	float salary;
	
	Employee1()
	{
		
	}
	Employee1(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	static Employee1 display()
	{
		Employee1 e1=new Employee1 (101,"pralay",20000);
				return e1;
		
	}
	@Override
	public String toString() {
	return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class Employee {

	public static void main(String[] args) {
            
		System.out.println(Employee1.display());

	}

}
