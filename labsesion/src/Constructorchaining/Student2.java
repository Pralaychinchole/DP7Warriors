package Constructorchaining;
import java.util.Scanner;
public class Student2 {

private	int id;
private	String name ;
private	String address;
	 private String cname;
	
Student2(int id,String name,String address)
{
	this.id=id;
	this.name=name;
	this.address=address;
	this. cname="thinkQ";
}
Student2(int id,String name,String address,String cname)
{
	this.id=id;
	this.name=name;
	this.address=address;
	this.cname=cname;

}
public int getId()
{
	return id;
}
public String getName()
{
	return name;
}
public String getAddress()
{
	return address;
}
public String getCname()
{
	return cname;
}

public String toString() {
	return "Student2 id=" + id + ", name=" + name + ", address=" + address ;
}
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice 1 or 0");
		int  choice=sc.nextInt();
		Student2 s1;
		if (choice==1)
		{
			s1=new Student2(101,"pralay","kopargaon","ThinkQ");
					System.out.println(s1);
		}
		else if(choice==0)
		{
			System.out.println("Enter collage name");
			String cname=sc.next();
		 s1=new Student2(102,"sarang","shirdi",cname);
				
		}
		else
		{
			System.out.println("choose another number");
			return;
		}
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getCname());
		
			
	}

}
