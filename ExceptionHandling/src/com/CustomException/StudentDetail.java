package com.CustomException;

class Percentage 
{
	private int id;
	private String name;
	private float marks;
	public Percentage() {
		super();
		
	}
	public Percentage(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	
	void marks()
	{
	  	System.out.println("Subject wise marks");
        
	  	
	}
	
	
	@Override
	public String toString() {
		return "Percentage [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
public class StudentDetail {

	public static void main(String[] args) {
		
		Percentage  p1=new Percentage ();
		
		p1.setId(101);
		p1.setName("pralay");
		p1.setMarks(-32);
		
		System.out.println(p1);
	}

}
