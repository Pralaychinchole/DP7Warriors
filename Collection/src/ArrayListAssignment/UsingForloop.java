package ArrayListAssignment;
import java.util.ArrayList;

public class UsingForloop {
	
	
	    public static void main(String[] args) {
	
	        ArrayList<Integer> a1 = new ArrayList<>();

	        // Add some elements to the ArrayList
	        a1.add(1);
	        a1.add(2);
	        a1.add(3);
	        a1.add(4);
	        a1.add(5);

	        // Iterate through the ArrayList using a for loop
	        for (int i = 0; i < a1.size(); i++) {
	            int element =a1.get(i);
	            System.out.println("Element at index " + i + ": " + element);
	        }
	    }
	}



