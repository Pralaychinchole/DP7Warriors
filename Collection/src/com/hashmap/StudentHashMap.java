package com.hashmap;

import java.util.HashMap;
import java.util.Map;


public class StudentHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,Student> hm=new HashMap<>();
		
		hm.put(101, new Student(101,"anuj",90));
		hm.put(102, new Student(102,"pralay",98));
		hm.put(103, new Student(103,"Hrushi",96));
		hm.put(104, new Student(104,"shivam",99));
		hm.put(105, new Student(105,"kailash",50));
		
		
//	
//		for(Map.Entry<Integer, Student> e:hm.entrySet());
//		{
//			System.out.println("Id"+e.getKey());
//			System.out.println("detail:"e.getvalue());
//			System.out.println("-----------------------------------");
//		}
                    
		for(Map.Entry<Integer, Student> e:hm.entrySet())
		{
			
			System.out.println("Id"+e.getKey());
			Student s=e.getValue();
			System.out.println("details"+e.getValue().getName()+" "+e.getValue().getMarksl());
			System.out.println("-----------------------");
		}
		
		
	}

}
