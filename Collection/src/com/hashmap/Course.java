package com.hashmap;

public class Course {

	private int id;
	private String name;
	private float fees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String name, float fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the fees
	 */
	public float getFees() {
		return fees;
	}
	/**
	 * @param fees the fees to set
	 */
	public void setFees(float fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
	
	
}
