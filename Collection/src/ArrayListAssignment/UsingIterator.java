package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;
//4.	WAP to print all elements of ArrayList using iterator
public class UsingIterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> i1=new ArrayList<>();
		
           i1.add(11);
           i1.add(34);
           i1.add(14);
           i1.add(56);
           i1.add(67);
           
           Iterator<Integer> e=i1.iterator();
           while(e.hasNext())
           {
        	   System.out.println(e.next());
           }
	}

}
