package com.Overriding;


class parent1
{
	int data=70;
	
	
	void printdata()throws ArithmeticException
	{
		System.out.println("data");
	}
	
	
}
class child1 extends parent1
{
	int val=0;
	void printdata()throws RuntimeException,ArrayIndexOutOfBoundsException
	{
		if(val==0)
			throw new ArithmeticException();
		System.out.println(data/val);
		
	}
}


public class UnCheckedOverriding2 {

}
