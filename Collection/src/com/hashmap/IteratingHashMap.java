package com.hashmap;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingHashMap {

	public static void main(String[] args) {
		
		HashMap<String,Double> hm=new HashMap<>();
		
          hm.put("kailash", 89.6);
		  hm.put("pralay", 67.8);
		  hm.put("vishal", 74.8);
		  hm.put("shivam", 87.8);
		  hm.put("hrushi", 69.8);
        
		  //1st way
        System.out.println(hm);
          
        
        //2nd way
        
        System.out.println("===============");
        
        Set<String> keys=hm.keySet();
        
        for(String s:keys)
        {
        	System.out.println(s+"-------------->"+hm.get(s));
        }
     
        System.out.println("==============");
        //3rd way
        
        Iterator<String> itr=keys.iterator();
        
        while(itr.hasNext())
        {
        	String k=itr.next();
        	System.out.println(k+"---------->"+hm.get(k));
        }
        
        System.out.println("======================");
        //4th way
        
        Collection<Double>marks=hm.values();
        for(Double m:marks)
        {
        	System.out.println(m);
        }
        
        System.out.println("=================");
        //5th way
      Set<Map.Entry<String, Double>> entries=hm.entrySet();
		
		for(Map.Entry<String,Double> e:entries)
		{
			System.out.println(e.getKey()+"=="+e.getValue());
		}
		
		System.out.println("=====================================");
		
		// 6th way
		
		
		for(Map.Entry<String, Double> e:hm.entrySet())
		{
			System.out.println(e.getKey()+"--->"+e.getValue());
		}

       
        
	}

}
