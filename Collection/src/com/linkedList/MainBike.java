package com.linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MainBike {

	public static void main(String[] args) {
		
		LinkedList<Bike> b1=new LinkedList<>();
		
        b1.add(new Bike(101,"Honda",50000,2019));
        b1.addLast(new Bike(10,"Kawasaki",53000,2015));
        b1.addFirst(new Bike(103,"TVS",60000,2022));
        b1.addFirst(new Bike(104,"bajaj",70000,2018));
        b1.add(2,new Bike(105,"BMW",77000,2009));
        b1.add(new Bike(106,"Hero",56000,2016));
        
        
       Collections.sort(b1);
        for(Bike b:b1)
        {
        	System.out.println(b);
        }
        System.out.println("--------------------------------------");
		
        Iterator<Bike> itr=b1.iterator();
        while(itr.hasNext())
        {
        	if (itr.next().getModelYear()<2010)
        	{
        		itr.remove();
        	}
        	
        }
        for(Bike b:b1)
        {
        	System.out.println(b);
        }
        
        
        
	}

}
