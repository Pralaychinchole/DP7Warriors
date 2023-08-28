package ifelse;
import java.util.Scanner;

public class Divisible {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		if(number%5==0 && number%11==0)
		{  
		System.out.println("The number Divible");
		}
		else
		{
			System.out.println("The number is not Divisible");
		}	
		
		
		
		
		
		
		
	}
}
