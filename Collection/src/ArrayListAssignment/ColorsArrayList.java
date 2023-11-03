package ArrayListAssignment;

import java.util.ArrayList;

public class ColorsArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<>();
		
		a1.add("red");
		a1.add("black");
		a1.add("orange");
		a1.add("pink");
		a1.add("Yellow");
		a1.add("Grey");
		
		for(String s:a1)
		{
			System.out.println(s);
		}
		
	}

}
