package com.containtment;

public class Library {

	public static void main(String[] args) {
		
		Author a1=new Author(101,"jkr Rowlling");
		Author a2=new Author(102,"Sudhamurthy");
		
		
		Book b1=new Book(101,"Harry potter",1200f,a1);
		Book b2=new Book(101,"Lost of magic temple",1200f,a2);
		
		
		System.out.println(b1);
		System.out.println(b2);
		

	}

}
