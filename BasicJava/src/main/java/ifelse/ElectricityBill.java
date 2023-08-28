package ifelse;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the unit");

		float unit=sc.nextFloat();
		
		if(unit<=50) 
		{
			
			System.out.println("Electricity bill is"+((unit*0.50)+(unit*0.50)*0.20));
		}
		else if (unit<=150)
		{
			System.out.println("Electricity bill is"+((25+(unit-50)*0.75)+(25+(unit-50)*0.75)*0.20));
		}
		else if(unit<=250)
		{
			System.out.println("Electricity bill is "+((100+(unit-100)*1.20)+(100+(unit-100)*1.20)*0.20));
			
		}
	
		
			
		
			
		
		
		
			
			
			
			
			
			
	}	
	
		
}


