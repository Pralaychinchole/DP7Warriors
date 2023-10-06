package com.Advance;

public class SecondHighestWithoutSorting {

	static void secondHigh(int ar[])
	{
		int highest=Integer.MIN_VALUE;
		int shighest=Integer.MIN_VALUE;
		
		for (int i=0;i<ar.length;i++)
		{
			if(ar[i]>highest)
			{
				highest=shighest;
				highest=ar[i];
			}
			else if(ar[i]>shighest) {
				
				shighest=ar[i];
			}
		}
		System.out.println("Second highest num is"+shighest);
	}
	
	public static void main(String[] args) {
		
		int ar[]= {6,7,10,8,9,4,5};
		
		secondHigh(ar);

	}

}
