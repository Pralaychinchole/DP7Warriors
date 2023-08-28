package ifelse;
import java.util.Scanner;

public class Factor1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int number=sc.nextInt();
		
		System.out.println("enter the factor");
		int factor=sc.nextInt();
		
		if(number%factor==0)
		{
		System.out.println(+factor+"is factor of"+number);
			
		}
		else
		{
	
			System.out.println(+factor+"is not factor of"+number);
			
			
		}
		
		
		
		
		

	}

}
