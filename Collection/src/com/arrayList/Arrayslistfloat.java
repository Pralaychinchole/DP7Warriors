package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arrayslistfloat {

	public static void main(String[] args) {
		
		ArrayList<Float> a1= new ArrayList<>();
		
           a1.add(23.4f);
           a1.add(76.4f);
           a1.add(67.4f);
           a1.add(88.0f);
           a1.add(83.43f);
           
           //normal for loop
           
           for(int i=0;i<a1.size();i++)
           {
        	   System.out.println(a1.get(i));
        	   
           }
           System.out.println("--------------------------------------");
           //enhance for loop
           
           for (float f:a1)
           {
        	   System.out.println(f);
           }
           
           System.out.println("-------------------------------------");
           //Iterator
           
           Iterator<Float> itr=a1.iterator();
           while(itr.hasNext())
           {
        	 System.out.println(itr.next());
           }
                
           System.out.println("----------------------------------------");
           //List-Iterartor forward
           
           ListIterator<Float>  litr=a1.listIterator();
           while(litr.hasNext())
           {
        	   System.out.println(litr.next());   
           }
           
           System.out.println("-------------------------------------------");
           
           // listIterartor backword
           
           ListIterator<Float> lit=a1.listIterator(a1.size());
           while(lit.hasPrevious())
           {
        	   System.out.println(lit.previous());
           }
           

           
	}

}
