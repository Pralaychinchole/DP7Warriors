package com.Practice;

class A
{
private int i=10;
int j=20;
protected int k=30;
public int m=30;
	 
void display()
{
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	System.out.println(m);

	
}
}
class B 
{
	
void display()
{
   A a=new A();

	{
		System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.k);
		System.out.println(a.m);
	}
	
}

class C extends A
{

void display()

{
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	System.out.println(m);
	
}

}
public class ClassDemo {

	public static void main(String[] args) {
		 
		A a=new A();
		a.display();
		a.display();
		a.display();
		a.display();
		
        B b=new B();
        b.display();
        b.display();
        b.display();
        b.display();
        
		C c=new C();
		b.display();
		b.display();
		b.display();
		b.display();
		
	}

}

}

