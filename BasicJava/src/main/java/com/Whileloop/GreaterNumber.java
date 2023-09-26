package com.Whileloop;

public class GreaterNumber {

	public static void main(String[] args) {
		
		
        int num=456789;
     int  max=0;
     int rem=num%10;//9  
      num/=10;//45678
     while(num>0)
		{
			int rem1=10%num;//8
			if (rem>rem1)
			{
			max=rem;
			}
			
			num=num/10;
			
		}
		
		System.out.println("the greatest digit is "+max);
		
		

	}

}
