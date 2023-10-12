package com.constructor;

class Item {
	
     private String name;
     private int id;
     private float price;
     
     Item()
     {
    	 
     }
     Item(String name,int id,int price)
     {
    	 this.id=id;
    	 this.name=name;
    	 this.price=price;
     }
     public float getPrice()
     {
    	return price; 
     }
     public void setPrice(float price)
     {
    	 this.price=price;
     }
     public String toString()
     {
    	 return id+" "+name+"  "+price;
     }
     
}

public class Grocceryshop {
       
	static void getdiscount(Item i)
	{
		if(i.getPrice()>200)
		{
			float p= i.getPrice();
			p= (p-(0.1f*p));
			i.setPrice(p);
		}

		
		
	}
	
	
	public static void main(String[]args) {
            Item i1=new Item("flour",1,200);
            Item i2=new Item("rice",2,450);
            Item i3=new Item("biscuit",3,250);
            Item i4=new Item("choclate",4,280);
            Item i5=new Item("cofee",5,250);
            
            System.out.println("---------------------------");
            
            System.out.println(i1); 
            System.out.println(i2);
            System.out.println(i3);
            System.out.println(i4);
            System.out.println(i5);
            
            System.out.println("--------------------------------");
            
            getdiscount(i1);          
            getdiscount(i2); 
            getdiscount(i3); 
            getdiscount(i4); 
            getdiscount(i5); 
            
            
            System.out.println("-------------After Discount------------------------");
    		System.out.println(i1);
    		System.out.println(i2);
    		System.out.println(i3);
    		System.out.println(i4);
    		System.out.println(i5);
    		

            
            
}
	
}