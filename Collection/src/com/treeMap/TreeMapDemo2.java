package com.treeMap;


	import java.util.SortedMap;
	import java.util.TreeMap;

	public class TreeMapDemo2 {
		
		public static void main(String[] args) {
			
	        TreeMap<Integer,String> tmap= new TreeMap<>();
			
			tmap.put(3, "java");
			tmap.put(1, "html");
			tmap.put(8, "C");
			tmap.put(4,"c++");
			tmap.put(6, "Python");
			tmap.put(4, "Angular");
			//tmap.put(null,"Hi"); Null Pointer Exception
			
			System.out.println(tmap);
			// Methods
			// Sorted Map
			System.out.println("First Key:"+tmap.firstKey());
			System.out.println("Last Key:"+tmap.lastKey());
			
			SortedMap<Integer, String>s1=tmap.subMap(3,6);// 3 included // 6 excluded
			System.out.println(s1);
			
			SortedMap<Integer, String>s2=tmap.headMap(3);// entries before 3 and 3 is excluded
			
			System.out.println(s2);
			
	        SortedMap<Integer, String>s3=tmap.tailMap(3);  // entries after 3 and 3 is included
			
			System.out.println(s3);
		 
			//Navigabel Map
			
			System.out.println("lower Key:"+tmap.lowerKey(5)); //strictly less
		 
			System.out.println("floor key:"+tmap.floorKey(4));//less or tha equal to
			
			System.out.println("higher key:"+tmap.higherKey(4));//strictly higher
			
			System.out.println("Ceiling key:"+tmap.ceilingKey(4));//equal to or greater then
			
			SortedMap<Integer, String>s4=tmap.subMap(3,false,6,true);// 3(from) included // 6(to) excluded
			System.out.println(s4);
			
            SortedMap<Integer, String>s5=tmap.headMap(3,true);// entries before 3 and 3 is excluded
			
			System.out.println(s5);
			
           SortedMap<Integer, String>s6=tmap.tailMap(3,false);  // entries after 3 and 3 is included
			
			System.out.println(s6);
			
		}
		

	}



