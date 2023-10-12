package com.accssmodifier;

public class Demo {

	public static void main(String[] args) {
		AccessDemo obj=new AccessDemo();
	//	obj.a=89;//bcoz it is private
		obj.b=67; // default
		obj.d=56;//public
		
	//	obj.show();// it is private
		obj.display();
		obj.test();
		
//default and public can access in diff class in same package
		
	}

}
