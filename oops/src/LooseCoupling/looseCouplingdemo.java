package LooseCoupling;

interface MessageSer
{
	void sendMessage(String msg);
	
}

class Whatsapp1 implements MessageSer
{
String type;
	
	@Override
	public void sendMessage(String msg) {
	
	{
		
		this.type="Whatsapp";
		System.out.println(type+" "+msg);
	}
		
	}
	
}
	class Telegram implements MessageSer
	{
	String type;
		
		@Override
		public void sendMessage(String msg) {
		
		{
			
			this.type="Telegram";
			System.out.println(type+" "+msg);
		}

	
		}
		
	}


	
public class looseCouplingdemo {
	
	public void messagetype(MessageSer m)
	{
		
		m.sendMessage("Welcome");
	}

	public static void main(String[] args) {
		
		 looseCouplingdemo obj=new  looseCouplingdemo ();
		 Whatsapp1 w1 =new Whatsapp1();
		 
		obj.messagetype(w1);
		
		Telegram t1=new Telegram();
		obj.messagetype(t1);
		
	}
	
	
}
