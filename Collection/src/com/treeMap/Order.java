package com.treeMap;

public class Order {

	private int pid;
	private String pname;
	private int price;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}
	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
}
