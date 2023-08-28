package ifelse;
import java.util.Scanner;

public class BloodDonate {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter the Age");
     
	int age= sc.nextInt();
	
	System.out.println("Enter the weight");
	
	int weight=sc.nextInt();
	
	if (age>18) 
	{
		if(weight>70) 
		{
		System.out.println("You are Eligible");
		
		}
		else 
		{
			System.out.println("You are under weight not eligible");
		}
		
	}
	
	else
	     
	{
		
		System.out.println("You are not eligible");
	}
	
	
	}

}
