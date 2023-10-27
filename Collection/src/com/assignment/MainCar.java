package com.assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MainCar {

	static void giveDiscount(ArrayList<Car> itrr) {
		for (Car c : itrr) {
			if (c.getPrice() > 300000) {
				int Price = (int) (c.getPrice() - (c.getPrice() * 0.5));
				c.setPrice(Price);
			}

		}

	}

	public static void main(String[] args) {

		ArrayList<Car> c1 = new ArrayList<>();

		c1.add(new Car(2023, "Red", 500000, new Engine(33333, "Manual")));
		c1.add(new Car(2022, "Black", 530000, new Engine(22222, "Manual")));
		c1.add(new Car(2019, "grey", 540000, new Engine(44444, "Auto")));
		c1.add(new Car(2018, "Yellow", 550000, new Engine(77777, "Manual")));
		c1.add(new Car(2014, "White", 590000, new Engine(88888, "Auto")));

		ArrayList<Car> auto = new ArrayList<>();
		ArrayList<Car> manual = new ArrayList<>();

		for (Car c : c1) {
			System.out.println(c);
		}
		System.out.println("_____________________________");

		for (Car c : c1) {
			if (c.getEngine().getEnginetype().equals("Auto")) 
			{
				auto.add(c);
			} else {
				manual.add(c);
			}
		}

		System.out.println("-------Auto-----------");

		for (Car c : auto)
		{
			System.out.println(c);
		}
		System.out.println("---------Manual-----------");

		for (Car c : manual)
		{
			System.out.println(c);
		}

		System.out.println("--------------------------------------------");

		Iterator<Car> itr = c1.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("-------------get5%-Discount----------------------------");

		giveDiscount(c1);
		Iterator<Car> itrr = c1.iterator();
		while (itrr.hasNext())
		{
			System.out.println(itrr.next());
		}

		System.out.println("-------sort----------------------");

		Collections.sort(c1);
		for (Car c : c1) 
		{
			System.out.println(c);
		}
		System.out.println("---------------------remove-");

		Iterator<Car> it = c1.iterator();
		while (it.hasNext())
		{
			if (it.next().getEngine().getEnginetype().equals("Auto")) 
			{
				it.remove();
			}
		}
		for (Car c : c1) {
			System.out.println(c);
		}

	}

}
