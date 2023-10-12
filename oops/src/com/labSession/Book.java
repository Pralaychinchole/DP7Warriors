package com.labSession;

class BookB{
	
	private String bname;
    private int Id;
    private float price;
	private String aname; 
	private char category; 
	
	BookB ()
	{
		
	}
	BookB(String bname,int Id,float price,String aname,char category)
	{
		this.aname=aname;
		this.bname=bname;
		this.price=price;
		this.Id=Id;
	    this.category=category; 
	}
	public int getId()
	{
		return Id;	
	}
	public void setId(int id)
	{
		this.Id=id;
	}
	public String getAname()
	{
		return aname;
	}
	public void setAname(String aname)
	{
		this.aname=aname;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public String getBname()
	{
		return bname;
	}
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public char getCategory()	
	{
	   return category;	
	}
	public void setCategory(char category)
	{
	  this.category=category;
	}
	@Override
	public String toString() {
		return "BookB [bname=" + bname + ", Id=" + Id + ", price=" + price + ", aname=" + aname + ", category="
				+ category + "]";
	}
	
   	
	
}

public class Book {
                      
	static void discount(BookB b)
	{
		if (b.getCategory()=='s') 
		{	
		   float price=b.getPrice();
		   price=(float) (price-(price*0.1));
		   b.setPrice(price);
		   
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
     BookB b1=new BookB("c++",12,300f,"balguru",'s');
     BookB b2=new BookB("java",12,290f,"james",'o');
     BookB b3=new BookB("c",12,400f,"yashwant",'o');
     
     
     System.out.println(b1);
     System.out.println(b2);
     System.out.println(b3);
     
     System.out.println("---------s discount--------");
     
     discount(b1);
     discount(b2);
     discount(b3);
     System.out.println(b1);
     System.out.println(b2);
     System.out.println(b3);
     
	}

}
