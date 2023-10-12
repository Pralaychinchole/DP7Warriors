package com.polymorphism;

public class VolumeCalculator {

	
	void calculateVolume(double radius,double height)
	{
	   System.out.println("the volume of culinder="+3.14*radius*radius*height);
		
	}
	void calculateVolume(int length,int breadth,int height)
	{
		System.out.println("The volume of cuboid is="+length*breadth*height);
	}
	

	
	public static void main(String[] args) {
		
            VolumeCalculator v1=new VolumeCalculator();
            v1.calculateVolume(3,2);
            	
            VolumeCalculator v2=new VolumeCalculator();
            v2.calculateVolume(3,2,1);
            
              
            
            	
         
     		
            
            
            
	}

}
