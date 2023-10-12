package com.Static;

public class Student1 {

	
	private int id;
	String name;
	float marks;
	static String scName;
	
	
	Student1()
	{
		scName="St joseph";
	}
	Student1(int id,String name,float marks)
	{
		this();
		this.id=id;
		this.name=name;
	   this.marks=marks;
		
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
	
	public float getMarks() {
		return marks;
	}
	
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public static String getScName() {
		return scName;
	}
	
	public static void setScName(String scName) {
		Student1.scName = scName;
	}
	

	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public static void main(String[] args) {
		
		
		Student1 s1=new Student1();
		System.out.println(s1.scName);
		
		Student1 s2=new Student1();
		System.out.println(s1.scName);

	}

}


