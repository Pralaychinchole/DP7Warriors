package com.hashmap;

public class Student {

	private int id;
	private String name;
	private int marksl;
	private  Course course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int marksl,Course course) {
		super();
		this.id = id;
		this.name = name;
		this.marksl = marksl;
		this.course=course;
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
	
	public int getMarksl() {
		return marksl;
	}
	
	public void setMarksl(int marksl) {
		this.marksl = marksl;
	}
	
	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marksl=" + marksl + ", course=" + course + "]";
	}

	
	
	
	
}
