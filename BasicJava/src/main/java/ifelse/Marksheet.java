package ifelse;
import java.util.Scanner;

public class Marksheet {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		
		String name=sc.next();
		
		System.out.println("Enter the sub1");
		
		int sub1=sc.nextInt();
		
		System.out.println("Enter the sub2");

	    int sub2=sc.nextInt();
	    
	    System.out.println("Enter the sub3");
	    
	    int sub3=sc.nextInt();
	     
	    System.out.println("Enter the sub4");
	    
	    int sub4=sc.nextInt();
	    
	    float percentage=((sub1+sub2+sub3+sub4)/400)*100;
	    
	    if(percentage>40)
	    {
	    	System.out.println(name+ "has score" +percentage+ "%congratulation");
	    	
	    }
	    else
	    {
	    	System.out.println(name+"has score"+percentage+"has fail better luck");
	    	
	    	
	    	
	    }

		
		
	}
	
	
	
	
	
}
