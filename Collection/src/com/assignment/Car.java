package com.assignment;

class Car implements Comparable<Car> {
	
	private int  modelno;
	private String colour;
	private int price;
	private Engine engine;
	
	
	public Car() {
		
	}


	public Car(int modelno, String colour, int price, Engine engine) {
		super();
		this.modelno = modelno;
		this.colour = colour;
		this.price = price;
		this.engine = engine;
	}


	public int getModelno() {
		return modelno;
	}


	
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}


	
	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Engine getEngine() {
		return engine;
	}


	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Car [modelno=" + modelno + ", colour=" + colour + ", price=" + price + ", engine=" + engine + "]";
	}


	@Override
	public int compareTo(Car c) {
		
		if(this.getPrice()<c.getPrice())
			return 1;
		else if(this.getPrice()>c.getPrice())
			return -1;
		
		return this.getEngine().getEnginetype().compareTo(c.getEngine().getEnginetype());
		
		
		
	}
	
	 
	
	
	

}
