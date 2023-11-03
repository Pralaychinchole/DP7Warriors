package com.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

       LinkedHashMap<String,Double> lhm=new LinkedHashMap<>(16,0.75f,true);
	
       lhm.put("Pralay", 96.0);
       lhm.put("Hrushi", 56.0);
       lhm.put("Suraj", 86.0);
       lhm.put("Aniket", 76.0);
       lhm.put("Kailash", 66.0);
       lhm.put("anuj", 98.0);
       
       for(Map.Entry<String ,Double> e:lhm.entrySet())
       {
    	   System.out.println(e.getKey()+" "+e.getValue());
    	   
       }
       System.out.println("=======================================");
       System.out.println("marks of suraj:"+lhm.get("Suraj"));
       
       
       System.out.println("-------------access order maintained--------------------------");
       
       for(Map.Entry<String ,Double> e:lhm.entrySet())
       {
    	   System.out.println(e.getKey()+" "+e.getValue());
    	   
       }
	}

}
