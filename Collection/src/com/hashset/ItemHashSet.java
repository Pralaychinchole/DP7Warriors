package com.hashset;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {
		
		HashSet<Item> i1=new HashSet<>();
		
		i1.add(new Item(101,"sugar",45));
		i1.add(new Item(102,"flour",75));
		i1.add(new Item(103,"choclate",85));
		i1.add(new Item(104,"chips",55));
		i1.add(new Item(101,"sugar",45));
	
		for(Item i:i1)
		{
			System.out.println(i);
		}
		
	}

}
