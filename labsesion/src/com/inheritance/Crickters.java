package com.inheritance;

 class Crickte {

	private int playerid;
	private String name;
	private boolean baller;
	private float strikerate;
	private int run;
	
	
	
	public void setPlayerid(int playerid)
	{
		this.playerid=playerid;
	}
	public int getPlayerid()
	{
		return playerid;
	}
	public void setName(String name)
	{
	   this.name=name;	
	}
	public String getName()
	{
		return name;
	}
	public void setBaller(boolean baller)
	{
		this.baller=baller;
	}
	public boolean getBaller() 
	{
		return baller;
	}
	public void setStrikerate(float strikerate)
	{
		this.strikerate=strikerate;
	}
	public float getStrikerate()
	{
		return strikerate;
	}
	public void setRun(int run)
	{
		this.run=run;
	}
	public int getRun()
	{
		return run;
	}
	
}

 public class Crickters{
	
	public static void main(String[]args)
	{
		
		
		Crickte c=new Crickte();
		
		c.setPlayerid(12);
		c.setName("pralay");
		c.setBaller(false);
		c.setRun(59);
		c.setStrikerate(0);
		
		System.out.println("id"+c.getPlayerid()+"name"+c.getName());
		
	}
 
}
