package com.containtment;

public class Country {

	private int id;
	private String name;
	private City city;
	
	
	

	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
   public void setCity(City city)
   {
	   this.city=city;
   }
   public City getCity()
   {
	   return city;
   }


	
}
