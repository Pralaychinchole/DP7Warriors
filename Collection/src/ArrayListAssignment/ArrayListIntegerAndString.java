package ArrayListAssignment;

import java.util.ArrayList;
//1.	WAP to add elements to arraylist without using generics (no <>)
//and print content of it where Integer is used. In second arraylist String is used.
public class ArrayListIntegerAndString {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<>();
		
		a1.add(22);
		a1.add(34);
		a1.add(45);
		a1.add(25);
		a1.add(56);
		
		System.out.println(a1);
		
		ArrayList<String> s1=new ArrayList<>();
		
		s1.add("Sumit");
		s1.add("Pralay");
		s1.add("Pratik");
		s1.add("Aditya");
		
		for(String s:s1)
		{
			System.out.println(s);
		}
	}

}
