package ArrayListAssignment;

import java.util.ArrayList;

public class RetainAll {

	public static void main(String[] args) {
		
//10.	WAP to retain all elements from ArrayList

		ArrayList<Integer> a1= new ArrayList<>();
		
		a1.add(11);
		a1.add(22);
		a1.add(33);
		a1.add(44);
		a1.add(55);
		a1.add(66);
		
	for(Integer s:a1)
	{
		System.out.println(s);
	}
		
	ArrayList<Integer> a2= new ArrayList<>();
	
	a2.add(12);
	a2.add(23);
	a2.add(33);
	a2.add(44);
	a2.add(52);
	a2.add(62);
	
	
	System.out.println(a2);
	
	a1.retainAll(a2);
	
	System.out.println(a1);
	}

}
