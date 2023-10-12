package com.accssmodifier;

public class AccessDemo {

	private int a;
	int b;//default
	//protected int c  :used in inheritance
    public int d;
    
    private void show()
    {
    	System.out.println("Hello");
    }
    
	void display()
	{
		System.out.println("Welcome");
	}
	
	public void test()
	{
		System.out.println("test");
	}
	
	public static void main(String[]args)
	
	{
		//inside the class every thing is accessible
		
		AccessDemo obj=new AccessDemo();
		obj.a=89;
		obj.b=67;
		obj.d=56;
		
		obj.show();
		obj.display();
		obj.test();
		
		
		
		
		
	}
	
	
	
}
