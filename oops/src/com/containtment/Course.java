package com.containtment;

public class Course {
  
	 private  int id;
	private  String Course;
	private float fees;
	
	Course()
	{
		
	}
	Course(int id,String Course,float fees)
	{
		this.id=id;
		this.fees=fees;
	    this.Course=Course; 
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public  int getId()
	{
	 return id;	
	}
	
	public void setFees(float fees)
	{
		this.fees=fees;
	}
	public  float getFees()
	{
		return fees;	
	}
	public void setCourse(String Course)
	{
		this.Course=Course;
	}
	public String getCourse()
	{
		return Course;
	}

	public String toString() {
		return "Course [id=" + id +  ", Course=" + Course + ", fees=" + fees + "]";
	}
}
