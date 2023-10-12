package com.labSession;

public class Customer {
    
	
	  int cId ;
	  String Cname;
	  int accno;
	double balance=10000;
	
	 public void setCId(int cId)
	  {
		  this.cId=cId;
	  }
	  public int getCId()
	  {
		  return cId;
	  }
	  public void setCname(String Cname)
	  {
		  this.Cname=Cname;
	  }
	 public String getCname()
	 {
		return Cname;
	 }
	 public void setAccno(int accno)
	 {
		 this.accno=accno;
	 }
	 public int getAccno()
	 {
		 return accno;
	 }
 public void setBalance(double balance)
 {
	 this.balance=balance;
 }
	public double getBalance()
	{
		return balance;
	}
	 
	public String toString()
	{
return "customer id"+cId+  "customer name"+Cname+  "customer acc no"+accno+  " balance"+balance;
				
		
	}
	
	
	
	
	
	
}
