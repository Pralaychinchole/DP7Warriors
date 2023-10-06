package com.Basicarrys;

import java.util.Arrays;

public class SortingArray {

		static void sortArray(int ar[])
		{
			for (int i=0;i<ar.length;i++)
			{
				for (int j=i+1;j<ar.length;j++)
				{
					//swapping
					if(ar[i]>ar[j])//as
					{
						int temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					}
				}
			}
}

		public static void main(String[] args) {
			
			int arr[]= {3,5,6,9,8,7};
			
			System.out.println("before sorting:"+Arrays.toString(arr));
		  sortArray(arr);
		  System.out.println("after sorting"+Arrays.toString(arr));
		}
			
	}