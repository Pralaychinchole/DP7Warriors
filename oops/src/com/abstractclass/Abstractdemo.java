package com.abstractclass;

abstract class Bike {
	private int id;
	private String model;
	private float cost;

	static String brandName;
	static float discount;

	Bike() {

	}

	Bike(int id, String name, float cost) {
		this.id = id;
		this.model = model;
		this.cost = cost;
		this.brandName = brandName;
	}

	static {
		brandName = "honda";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public static String getBrandName() {
		return brandName;
	}

	public static void setBrandName(String brandName) {
		Bike.brandName = brandName;
	}

	abstract void description();

	static float giveDiscount(int dis) {
		discount = dis;
		return discount;
	}

	final void display() {
		System.out.println("Brand name:" + brandName);
		System.out.println("Discount on all bikes:" + discount + "%");
		System.out.println("-----------------------------------------------------------");

		System.out.println("Id:" + id);
		System.out.println("Model:" + model);
		System.out.println("Cost:" + cost);
		System.out.println("Discounted cost:" + (cost - ((discount / 100) * cost)));
	}

}

class Sportbike extends Bike {
	private int gears;
	private float speed;

	Sportbike() {

	}

	public Sportbike(int id, String model, float cost, int gears, float speed) {
		super(id, model, cost);
		this.gears = gears;
		this.speed = speed;
	}

	void description() {
		System.out.println("This is sport bike");
		System.out.println("number od=f gear is" + gears);
		System.out.println("the high speed is" + speed);

	}

}

class BasicBike extends Bike {
	private float avg;

	BasicBike() {

	}

	public BasicBike(int id, String model, float cost, float avg) {
		super(id, model, cost);
		this.avg = avg;

	}

	@Override
	void description() {

		System.out.println("This is a normal bike -----");
		System.out.println("Number of gears:4");
		System.out.println("Average is:" + avg);
	}

}

public class Abstractdemo {

	public static void main(String[] args) {

		// cannot create object super clasd Bike b1= new Bike(101,"fz5",40000f,50);

		Bike.giveDiscount(20);

		Sportbike b1 = new Sportbike(101, "CVR10", 78000, 6, 250);

		b1.display();
		b1.description();

		BasicBike b2 = new BasicBike(102, "platina", 40000, 80f);
		b2.display();
		b2.description();

	}

}
