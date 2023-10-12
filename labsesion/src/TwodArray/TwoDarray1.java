package TwodArray;

import java.util.Scanner;

public class TwoDarray1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter number of rows");
		int row=sc.nextInt();
		
		System.out.println("Enter the number of coloumn");
		int  colm=sc.nextInt();
		
		int ar[][]=new int [row][colm];
		
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<colm;j++)
			{
				ar[i][j]=sc.nextInt();
			}
			
		
		}
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<colm;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
		
		System.out.println("");
		
	}

	}
}
