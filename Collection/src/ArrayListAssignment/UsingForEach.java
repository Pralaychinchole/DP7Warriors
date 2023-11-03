package ArrayListAssignment;

import java.util.ArrayList;

//	6.	WAP to iterate through all elements in an ArrayList using for each
	public class UsingForEach {
		
	public static void main(String[] args) {
		
		ArrayList<String> s1=new ArrayList<>();
	
		s1.add("mango");
		s1.add("Apple");
		s1.add("banana");
		s1.add("kivi");
		s1.add("orange");
		
		for(String s:s1)
		{
			System.out.println(s);
		}
		
	}
		
}
