package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CourseHashMap {

	public static void main(String[] args) {
		
		HashMap<Student,Course> hm= new HashMap<>(); 

		Course c1=new Course (111,"java",67000f);
		Course c2=new Course (222,"Paython", 45000f);
		
         hm.put(new Student(101,"prasad",89),c1);
         hm.put(new Student(10,"prasad",89),c1);
         hm.put(new Student(103,"kailash",89),c2);
         hm.put(new Student(104,"Hrushi",89),c2);
         hm.put(new Student(105,"Suraj",89),c2);
         
         for() 
         {
        	 
        	 
         }
		
	}

}
