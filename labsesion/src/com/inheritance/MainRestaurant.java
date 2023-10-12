package com.inheritance;

class Restaurant
{
	private int id;
	private String name;
  	Menu menu;
	
 Restaurant() 	 
 {
	 
 }
 Restaurant(int id,String name,Menu menu)
 {
	 this.id=id;
	 this.name=name;
	 this.menu=menu;
	 
 }


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Menu getM() {
	return menu;
}

public void setM(Menu m) {
	this.menu = menu;
}
@Override
public String toString() {
	return "Restaurant [id=" + id + ", name=" + name + ", m=" + menu + "]";
}
  	
  
}
class Menu
{
	
	private String menu;
	
	
	Menu(String menu)
	{
		this.menu=menu;
		
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}


	public String toString() {
		return "Menu [menu=" + menu + "]";
	}
	
	
	
	
}




public class MainRestaurant {

	public static void main(String[] args) {
		
		Menu m1=new Menu("chinese");
		Menu m2=new Menu("Nooodles");
		Menu m3=new Menu ("manchurian");
		
	 
	 Restaurant r1=new Restaurant(1,"subway",m1);
	 Restaurant r2=new Restaurant(2,"Rajsthan",m2);
	 Restaurant r3=new Restaurant(3,"maharaja",m3);
	 
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

	}

}
