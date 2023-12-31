package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> a1= new ArrayList<>();
		
		a1.add("mango");
		a1.add("cherry");
		a1.add("kiwi");
		a1.add("papaya");
		a1.add("orange");
		
		System.out.println(a1);
		
		//  1st way

		for (int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
			
		}
		//2nd way
		
		System.out.println("------------------------------------------");

		for (String s: a1)
		{
			System.out.println(s);
		}
		
		System.out.println("----------------------------------");
		  //3rd way(Iterator)
		
		Iterator<String> itr=a1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
		}
		System.out.println("---------------------------------------");
		//4 th way(ListIterator)

		ListIterator<String> litr=a1.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("-----------------------------------------");
		 //5th Reverse
		
		ListIterator<String> litr1=a1.listIterator(a1.size());
		while(litr1.hasPrevious())
		{
			System.out.println(litr1.previous());
		}
			
		
		
		
	}

}
