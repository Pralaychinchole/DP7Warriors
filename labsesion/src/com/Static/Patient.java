package com.Static;

public class Patient {

      String pname;
      String dname;
   static  int count;
static	String hname;
    
	
	
	static
	{   hname="sahyadri";
		
	}
	Patient (String pname,String dname)
	{
		this.pname=pname;
		this.dname=dname;
		count++;

	}
	void display()
	{
		System.out.println("patient name="+pname);
		System.out.println("doctor name="+dname);
		System.out.println("hospital name="+hname);
	}
	
	
	
	public static void main(String[] args) {
		
		Patient p1=new Patient("xyz","abc");
		Patient p2=new Patient("aaa","bbb");
		
	    p1.display();
		p2.display();
		
		System.out.println("no of patient visit="+count);
	}

}
