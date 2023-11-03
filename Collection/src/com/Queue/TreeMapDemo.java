package com.Queue;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> tmap=new TreeMap<>();
	
		
		tmap.put(3, "html");
		tmap.put(1, "java");
		tmap.put(8, "c");
		tmap.put(4, "c++");
		
		//Iterating
		System.out.println(tmap);

		//
		System.out.println("----------------");
		Set<Integer> keys=tmap.keySet();
		
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			System.out.println(key+tmap.get(key));
		}
	
		////
		for(Map.Entry<Integer, String> e:tmap.entrySet())
		{
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		
		System.out.println("---------------------------------");
		
		Set<Entry<Integer,String>> entries=tmap.entrySet();
		
		for(Map.Entry<Integer,String> e:entries)
		{
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		
		System.out.println("------------------------");
		//reverse
		
		NavigableMap<Integer,String> ns=tmap.descendingMap();
		
	}

}
