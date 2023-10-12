package Constructorchaining;

import com.lab.Student;

public class StudentC {

	private int id;
	private String name;
	private float marks;
	
	
	StudentC(){
		
		this(1222,"pralay",89f);
			
	}
	
	StudentC(int id,String name,float marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	
	
	void display()
	{    
		this.show();
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
	}
	
	void show ()
	{
		System.out.println("student info.");
	}
	
	
	public static void main(String[]args) {
		
		StudentC s1=new StudentC();
		//StudentC s2=new StudentC(102,"aniket");
		
	
		s1.display();
		//s2.display();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
