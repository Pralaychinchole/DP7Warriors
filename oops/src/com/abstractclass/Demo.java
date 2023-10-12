package com.abstractclass;

abstract class Animal
{   
    String name;
    String colour;
   
    Animal()
    {
    	
    }
    Animal(String name,String colour)
    {
    	this.name=name;
    	this.colour=colour;
    }
	  
    abstract  void description();
       
    
	void show()
	{
		System.out.println("animal");
	}
}

class Tiger extends Animal
{
    Tiger()
    {
    	
    }
	Tiger(String name,String colour)
	{
		this.colour=colour;
		this.name=name;
		
	}
	@Override
	void description() {
		System.out.println("=======");
		
	}
	
	void show()
	{
		System.out.println("it is a tiger");
	}
}


public class Demo {

	public static void main(String[] args) {
		
           Animal a1;
            
           a1=new Tiger();
		
           a1.show();
           a1.description();
	}

}
