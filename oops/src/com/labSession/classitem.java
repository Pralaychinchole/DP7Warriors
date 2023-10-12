package com.labSession;

public class classitem {

	int itemId;
	String itemname;
	float price;
	 
	 void display () {
		 System.out.println(+itemId+" "+itemname+" "+price);
		 
	 }
	
	public static void main(String[] args) {
		
		 classitem i=new classitem();
		
		 i. itemId=1234;
         i.itemname=(" blackboard")	;
		i.price=200;
        
		i.display();
		
	}

}
