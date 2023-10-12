package com.containtment;

public class Student {

	private int id;
	private String name;
	private Course course;

	Student() {

	}

	Student(int id, String name, Course course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
    public Course getCourse()
    {
    	return course;
    }
	
	
	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";

	}

}
