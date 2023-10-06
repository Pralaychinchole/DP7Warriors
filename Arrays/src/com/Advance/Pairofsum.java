package com.Advance;

public class Pairofsum {
        
	static void sumofpair(int ar[],int s)
	{
		for (int i=0;i<ar.length;i++)
		{
			if(ar[i]>s)
			
				continue;
			
			for(int j=i+1;j<ar.length;j++)
			{
				if((ar[i]+ar[j])==s)
				{
					System.out.println(ar[i]+" + "+ar[j]+" = "+s);
				}
			}

		}
		
		
	}
	public static void main(String[] args) {
	
         int ar[]= {1,2,4,5,6,5,7};
		int sum=6;
		
		sumofpair(ar,sum);
	}

}
