package com.classobject;
import com.accssmodifier.*;
public class Democheck {

	public static void main(String[] args) {
		
		AccessDemo obj=new AccessDemo();
	//	obj.a=89;//private
	//	obj.b=67; // default
	//	obj.d=56;//public
		
	//	obj.show();// it is private
	//	obj.display();//default
		obj.test();//public 

		//only public can accesss in other package 

	}

}
