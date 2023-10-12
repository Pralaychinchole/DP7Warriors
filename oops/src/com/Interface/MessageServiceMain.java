package com.Interface;

interface MessageService
{
   void sendMessage();
  
}
class Whatsapp implements MessageService
{

	@Override
	public void sendMessage() {
		System.out.println("whats app message");
		
	}
}
class Facebook implements MessageService
{

	@Override
	public void sendMessage() {
		System.out.println("its facebook");
		
	}
	
}
		
class Instagram implements MessageService
{

	@Override
	public void sendMessage() {
	  System.out.println("its instagram msg");
		
	}
	
	
}

public class MessageServiceMain {

	public static void main(String[] args) {
		
		MessageService m1;
		
		m1= new Whatsapp();
		m1.sendMessage();
		
		m1=new Facebook();
		m1.sendMessage();
		
		m1= new Instagram();
		m1.sendMessage();
				
		
		

	}

}
