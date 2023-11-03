package com.linkedhashSet;

import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {

	public static void main(String[] args) {
	
		LinkedHashSet<Employee> e1=new LinkedHashSet<Employee>();
		
		e1.add(new Employee(101,"kailash",22222));
		e1.add(new Employee(102,"Hrushi",555555));
		e1.add(new Employee(101,"kailash",22222));
		e1.add(new Employee(103,"shivam",33333));
		
		for(Employee e:e1)
		{
			System.out.println(e);
		}

	}

}
