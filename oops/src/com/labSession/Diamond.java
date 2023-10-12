package com.labSession;

public class Diamond {

	public static void main(String[] args) {
	
		for (int i=1;i<=5;i++) {
			
			for (int  j=1;j<=(5-i);j++) {
				
				System.out.println(" ");
				
			for (j=1;j<=i;j++) {
				
				if(j==1|| j==1) {
					
					System.out.print("* ");	
				}
				else {
					System.out.print(" ");
				}
				
			}
				System.out.println();
			}
			for ( i=4;i>=1;i--) {
				
				for (int  j=1;j<=(5-i);j++) {
					
					System.out.println(" ");
					
				for ( j=1;j<=i;j++) {
					
					if(j==1|| j==1) {
						
						System.out.print("* ");	
					}
					else {
						System.out.print(" ");
					}
					
				}
					System.out.println();
				}
			
			
		}
		
		
		
		}	
	}
}
	
	
	