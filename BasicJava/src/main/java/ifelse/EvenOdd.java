package ifelse;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[]args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the number");
	
	int num= sc.nextInt();
	
	if (num<=0)
	{
		System.out.println("The number is even");
	}
	else
	{
		System.out.println("the number is odd");

	}
	
	sc.close();
	
	
	
	
	}
}
