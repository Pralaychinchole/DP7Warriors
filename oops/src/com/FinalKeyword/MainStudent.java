package com.FinalKeyword;

final class Studntdetail
{    
	int rollnum;
	final static String schoolname;
    static int addhar;
	String sname;

static
{
	schoolname="kjscollage";

}



public Studntdetail()

{
	addhar=9635;
	
}
public Studntdetail(int rollnum,String Schoolname,int addhar,String sname)
{
	this.rollnum=rollnum;
	this.addhar=addhar;
	this.sname=sname;
	
}
	
public int getRollnum() {
	return rollnum;
}

public void setRollnum(int rollnum) {
	this.rollnum = rollnum;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public static String getSchoolname() {
	return schoolname;
}

public static int getAddhar() {
	return addhar;
}


public class MainStudent {


	Studntdetail s1= new Studntdetail(101,"New english",9635,"pralay");
	
	
	
	
}
}
