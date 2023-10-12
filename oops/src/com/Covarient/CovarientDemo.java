package com.Covarient;

class Person {
	int id;
	String name;

	Person() {

	}

	Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	Person showDetails() {
		name = name + "India";// return type person
		return this;

	}

	public String display() {
		return "person [id=" + id + ", name=" + name + "]";
	}
}

class Employee extends Person {
	float salary;

	Employee() {

	}

	Employee(int id, String name, float salary) {
		this.id = id;
		this.salary = salary;

	}

	Employee showDetails() {

		name = name + "thinkq";
		salary = salary + 1000;
		return this;
	}

	public String show() {
		return "id" + id + "name" + name + "salary" + salary;
	}

}

public class CovarientDemo {

	public static void main(String[] args) {

		Person ref;
		Employee eref;

		Person p = new Person(101, "Gaurav");
		ref = p.showDetails();
		System.out.println(ref.display());

		Employee e = new Employee(1001, "Sneha", 45000f);
		ref = e.showDetails();
		System.out.println(ref.display());
		// System.out.println(ref.show());

//		Employee e1= new Employee(1002, "Pratik", 55000f);
//		eref= (Employee) e.showDetails();  // casting
//		System.out.println(eref.show());

		Employee e1 = new Employee(1002, "Pratik", 55000f);
		eref = e.showDetails(); // no type casting required now
		System.out.println(eref.show());

	}

}
