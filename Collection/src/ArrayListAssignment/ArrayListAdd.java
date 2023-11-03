package ArrayListAssignment;

import java.util.ArrayList;

public class ArrayListAdd {
	//3.	WAP to use add operation of ArrayList
	public static void main(String[] args) {
		
		ArrayList<String> s1=new ArrayList<>();
		
		s1.add(0,"sumit");
		s1.add(1,"Hrushi");
		s1.add(2,"Pratik");
		s1.add(3,"Sarang");
	
		System.out.println(s1);
		System.out.println("--------");
		
		s1.add(1, "pralay"); //add operation
		
		for(String s:s1)
		{
			System.out.println(s);
		}
	}

}
