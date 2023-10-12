package com.covarient;

class Covarient
{
	Object show()
	{
		
	return new Object();	
	}
	
}

class Subcovarient extends Covarient
{
	Integer show()
	{
		return 45;
	}
	
}
class Subcovarient1 extends Covarient
{
	String  show()
	{
		return "pralay";
	}
	
}
class Subcovarient3 extends Covarient
{
	Float show()
	{
		return 2.3f;
	}
	
}
public class Covarientdemo {

	public static void main(String[] args) {
		
		Covarient c1;
		c1=new Subcovarient();
		System.out.println(c1.show());
		
		c1=new Subcovarient1();
		System.out.println(c1.show());

	    c1=new Subcovarient3();
	    System.out.println(c1.show());
		
	}

}
