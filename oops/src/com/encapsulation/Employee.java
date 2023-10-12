package com.encapsulation;

public class Employee {

	int empId;
  String ename;
  float salary;
  String department;
  
        
  public void setEmpId(int empId)
  {
	  this.empId=empId;
  }
  public int getEmpId()
  {
	  return empId;
  }
  public void setEname(String ename)
  {
	  this.ename=ename;
  }
 public String getEname()
 {
	return ename;
 }
 public void setSalary(float salary)
 {
	 this.salary=salary;
 }
 public float getSalary()
 {
	 return salary;
 }
 
 public void  setDepartment(String department)
 {
	this.department=department;
 }
 public String getDepartment()
 {
	 return department;
 }
 public String toString()
	{
return "employeId:"+empId+"Bookname"+ename+"sal1ry"+salary+" "+department;
	}
 
 
 
 
 }
