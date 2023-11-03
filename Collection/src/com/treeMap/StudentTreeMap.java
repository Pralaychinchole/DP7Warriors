package com.treeMap;

import java.util.HashMap;
import java.util.Map;

public class StudentTreeMap {

	public static void sortMarks(HashMap)
	
	public static void main(String[] args) {
		
		HashMap<Student,String> shm=new HashMap<>();
		
		shm.put(new Student(101,"pralay",98),"java");
		shm.put(new Student(101,"Hrushi",99),"Paython");
		shm.put(new Student(101,"Kailash",67),".net");
		shm.put(new Student(101,"Suraj",78),"devops");
		shm.put(new Student(101,"Shivam",87),"html");
		
		for(Map.Entry<Student, String> e:shm.entrySet())
		{
			
			System.out.println("id"+e.getKey());
			System.out.println("details"+e.getValue());
			System.out.println("------------------------------------");
		}
		
		
		
	}

}
