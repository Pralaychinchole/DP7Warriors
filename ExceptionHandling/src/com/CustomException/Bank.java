package com.CustomException;

class Account {

	private int accid;
	private String name;
	private float balance;

	public Account() {
		super();

	}

	public Account(int accid, String name, float balance) {
		super();
		this.accid = accid;
		this.name = name;
		this.balance = balance;
	}

	public int getAccid() {
		return accid;
	}

	public void setAccid(int accid) {
		this.accid = accid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	void deposite(double amount) {
		balance += amount;
		System.out.println(balance);
	}

	void withdraw(double amount) {
		try {
			if ((this.balance - amount) < 0)

				throw new InSufficientBalanceException("Your Balance is low");
			this.balance -= amount;
			System.out.println("amount withdraw" + amount);
			System.out.println("new balance" + balance);

		} catch (InSufficientBalanceException e) {
			System.out.println(e);
		}

	}

	@Override
	public String toString() {
		return "Account [accid=" + accid + ", name=" + name + ", balance=" + balance + "]";
	}

}

public class Bank {

	public static void main(String[] args) {
	
		Account a1=new Account();
		a1.setAccid(101);
		a1.setName("pralay");
		a1.setBalance(50000);

		   a1.deposite(400);
		   a1.withdraw(2500);
		   a1.withdraw(300);
		   

		
	}

}
