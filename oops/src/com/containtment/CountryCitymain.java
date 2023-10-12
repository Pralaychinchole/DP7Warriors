package com.containtment;

public class CountryCitymain {

	public static void main(String[] args) {
		
		
    Country c=new Country();
     c.setId(1);
      c.setName("India");
     
      City c1=new City();
      c.setCity(c1);
      c.getCity().setFamous("get way india "); 
      c.getCity().setId(2);
      c.getCity().setName("mumbai");
      
      System.out.println(c.getId());
      System.out.println(c.getName());
      System.out.println(c.getCity().getId());
      System.out.println(c.getCity().getName());
      System.out.println(c.getCity().getFamous());
      
      
	}

}
