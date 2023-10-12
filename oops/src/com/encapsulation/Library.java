package com.encapsulation;
import java.util.Scanner;
public class Library {

	public static void main(String[] args) {
		
		Book b1=new Book();
		b1.setBookId(101);
		b1.setBname("harry potter");
		b1.setPrice(890);
	
	
System.out.println(b1.getBookId()+" "+b1.getBname()+" "+b1.getPrice()+" ");		


    System.out.println(b1);
    
    
            // user input
    
    
    Book b2=new Book ();
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter bookId");
    //int id=sc.next();
    //b2.set bookId(id)
    
       b2.setBookId(sc.nextInt());
       
       System.out.println("Enter book name");
       b2.setBname(sc.next());
       
       System.out.println("Enter book price");
       b2.setPrice(sc.nextFloat())	;
	
	}

}
