package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayListConversion {

	public static void main(String[] args) {
	   
		//convert array to arraylist
		      
		String colour[]= {"red","Blue","green","Yellow"};
		
		
		//Arrays.sort(colour);
		
		//System.out.println(Arrays.toString(colour));
		
		//1st way
		List<String> al=Arrays.asList(colour);
		
		System.out.println(al);
		
		//2nd Way
		
		ArrayList<String> al2=new ArrayList<>(Arrays.asList(colour));
		
		System.out.println(al2);
		
		//3rd Way
		
		ArrayList<String> al3=new ArrayList<>();
		Collections.addAll(al3, colour);
		System.out.println(al3);
		
		
		System.out.println("=================================");
		
		
		//convert Arraylist to array
		
		Object [] col=al2.toArray();
		
		System.out.println(Arrays.toString(col));
		
		for (int i=0;i<col.length;i++)
		{
			col[i]=((String) col[i]).concat("colour");
		}
		System.out.println(Arrays.toString(col));
		
		//type safety is not there
		
		
		//type safe
		
		String[] cols=new String[al2.size()];
		al2.toArray(cols);
		
		for(int i=0;i<cols.length;i++)
		{
			cols[i]=cols[i].concat("colour");
		}
		System.out.println(Arrays.toString(cols));
	}

}
