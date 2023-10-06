package com.Basicarrys;

import java.util.Arrays;

public class FindFreqElement {

	static void findfreq(int ar[])
	{
		
		int count ;
		boolean visited;
		
		for (int i=0;i<ar.length;i++)
		{
			count=1;
			
			visited= false;
			
			for (int j=i-1;j>=0;j--)
			{
				if (ar[i]==ar[j])
				{
					visited=true;
					break;
					
				}
							
			}
			
			if(visited==false)
			{
				for (int k=i+1;k<ar.length;k++)
				{
					if(ar[i]==ar[k])
					{
						count++;
					}
				}
				System.out.println(ar[i]+"=======>"+count);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
         int ar[]= {1,4,5,1,3,2,1,2};
         
         findfreq(ar);
         
         System.out.println(Arrays.toString(ar));
		
	}

}
