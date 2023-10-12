package com.Static;

import java.util.Scanner;

public class Ticket {

	private int ticketNo;
	private int tId;
	private static int price;
	private static int availableTickets;

	Ticket() {
		price = 50;
		availableTickets = 25;
	}

	Ticket(int ticketNo, int tId, int price) {
		this.ticketNo = ticketNo;
		this.tId = tId;
		this.price = price;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTId(int iId) {
		this.tId = tId;
	}

	public int getTId() {
		return tId;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public int TicketCost(int ticketno) {
		if (availableTickets >= ticketno) {
			availableTickets = availableTickets - ticketno;
			price = price * ticketno;

		}
		return price;
	}

	void show() {
		System.out.println("Tickets details:" + tId + price);
	}

	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", tId=" + tId + "]";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Ticket t1 = new Ticket();
		while (true) {
			System.out.println("Enter ticket id");
			t1.tId = sc.nextInt();

			System.out.println("Eneter no of ticket");
	
			
			t1.ticketNo = sc.nextInt();

			if (t1.ticketNo <= availableTickets) {
				System.out.println("avilable tickets are" + availableTickets);

				int cost = t1.TicketCost(t1.ticketNo);
				System.out.println("Total Cost:" + cost);
				availableTickets=availableTickets-t1.ticketNo;
				System.out.println("avilable ticket"+availableTickets);
			}
		}

	}
}
