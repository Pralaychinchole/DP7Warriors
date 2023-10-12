package com.labSession;

class CheckRating{
	  
	private int id;
	private String name;
	private float rating;
	
	
	CheckRating()
	{
		
	}
	CheckRating(int id,String name,float rating)
	{
		this.id=id;
		this.name=name;
		this.rating=rating;
	}
	public int getId()
	{
		return id;	
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getNmae()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public float getRating()
	{
		return rating;
	}
	public void setRating(float rating)
	{
		this.rating=rating;
	}
	
	public String toString()
	{
		return id+" "+rating+" "+name;
	}
	
}


public class Movie {

	     static void rating(CheckRating c)
	     {
	    	 if (c.getRating()>7)
	    	 System.out.println(c);
	    	 
	     }
	
	public static void main(String[] args) {
	
        CheckRating c1=new CheckRating(101,"RRR",8.7f);      
        CheckRating c2=new CheckRating(102,"Gadar",4f);
        CheckRating c3=new CheckRating(103,"omg2",5f);
        CheckRating c4=new CheckRating(104,"Shershah",3f);
		
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
        
        System.out.println("_____rating 7+++_______");
        
        rating(c1);
        rating(c2);
        rating(c3);
        rating(c4);
        
	}

}
