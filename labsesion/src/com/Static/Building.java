package com.Static;

public class Building {

	int flatno;
	int floor;
	int members;
	
	static String Bname="Shree";
	
 static
{
	Bname="gokul";
}
  public Building (int flatno,int floor,int members)
   {
	   this.flatno=flatno;
	   this.floor=floor;
	   this.members=members;
	   
	  
 
   }
 public static void playarea()
 {
	 System.out.println("play area belong building"+Bname);
 }
public static void Swimingpool()	
{
	System.out.println("Swimimg pool belong to"+Bname);
}

void display() {
	 
	System.out.println("flat no="+flatno);
	System.out.println("floor no="+floor);
	System.out.println("member="+members);
	System.out.println("building name="+Bname);
}


	public static void main(String[] args) {
		 
		Building.playarea();
		Building.Swimingpool();
		
      Building b1=new Building(1,6,6);
      
		  b1.display();
		
		
		
	}

}
