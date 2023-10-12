package polymorphism;

class shape2
{
	int area(int side)
	{
		return(side*side);
	}
	
	int area (int len,int br)
	{
		return(len*br);
	}
	
	
	float area(float radius)
	{  float pi=3.14f;
		return (pi*radius*radius);
		
	}
	
}

public class Returnpoly {

	public static void main(String[] args) {
	
        shape2 sq=new shape2() ;
        sq.area(5);
        
        shape2 ractangle=new shape2();
        ractangle.area(4,7);
		
		shape2 circle=new shape2();
		circle.area(4f);
		
		
	}

}
