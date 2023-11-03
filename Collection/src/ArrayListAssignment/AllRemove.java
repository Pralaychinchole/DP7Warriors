package ArrayListAssignment;

import java.util.ArrayList;
public class AllRemove {


	//8.	WAP to removeAll element from ArrayList
	

		public static void main(String[] args) {
		
			ArrayList<String> a1=new ArrayList <>();
			
			a1.add("Sumit");
			a1.add("Sarang");
			a1.add("Aditya");
			a1.add("Pratik");
			a1.add("Mahendra");
			
			for(String s:a1)
			{
				System.out.println(s);
			}

			a1.removeAll(a1);//removeall Method
			
			System.out.println(a1);
			

		}

	}


