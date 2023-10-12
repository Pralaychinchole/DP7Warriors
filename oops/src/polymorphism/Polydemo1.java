package polymorphism;

class shape {
	
	void area(int side)
	{
		System.out.println("Area of square"+(side*side));
	}
	void ractangle(int length,int breadth)
	{
		System.out.println("area of ractangle"+(length*breadth));
	}
	void area(float radius)
	{   float pi=3.14f;
	System.out.println("Area of circle"+(pi*radius*radius));
		
	}
	
}


public class Polydemo1 {
    
	public static void main(String[]args)
	{
		shape square=new shape();
		square.area(7);
		
		shape ractangle=new shape();
		ractangle.area(6);
		
		shape circle=new shape();
		circle.area(2.3f);
	}
	
}
