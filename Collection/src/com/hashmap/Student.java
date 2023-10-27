package com.hashmap;

public class Student {

	private int id;
	private String name;
	private int marksl;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int marksl) {
		super();
		this.id = id;
		this.name = name;
		this.marksl = marksl;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marksl=" + marksl + "]";
	}
	
	
	
	
}
