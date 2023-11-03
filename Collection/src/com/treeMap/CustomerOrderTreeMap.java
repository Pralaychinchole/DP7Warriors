package com.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class CustomerOrderTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Customer,Order> tmap=new TreeMap<>(new CustomerOrderComparator());
		
		tmap.put(new Customer(101,"hrushi",999999999),new Order (1,"laptop",78000));
		tmap.put(new Customer(101,"hrushi",999999999),new Order (1,"pandrive",79000));
		tmap.put(new Customer(102,"Anuj",888888),new Order (2,"mobile",73000));
		tmap.put(new Customer(103,"Shivam",7777777),new Order (3,"Mouse",2000));
		tmap.put(new Customer(104,"suraj",2222222),new Order (4,"Pc",30000));
		tmap.put(new Customer(105,"Pralay",5555555),new Order (5,"LCD",67000));
		
		for(Map.Entry<Customer, Order>e:tmap.entrySet())
      
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("-----------------------");
		}
	}

}
