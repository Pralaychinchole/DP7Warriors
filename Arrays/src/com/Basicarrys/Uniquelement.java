package com.Basicarrys;

public class Uniquelement {

		static void findfreq(int ar[])
		{
		  int count;
		  for (int i=0;i<ar.length;i++)
		  {
			  if(ar[i]=='\0')
			  continue;
			  count=1;
			  for (int j=i+1;j<ar.length;j++)
			  {
				  if(ar[i]==ar[j])
				  {
					  count++;
					  ar[j]='\0';
				  }
				  
			  }
		
		if	( count==1)
		{
			System.out.println(ar[i]);
		}
					 
			
		  }
		  	
		}
		
		public static void main(String[] args) {
			
			int ar[]= {1,2,4,5,7,5,2};
			
			findfreq(ar);

		}

	}
