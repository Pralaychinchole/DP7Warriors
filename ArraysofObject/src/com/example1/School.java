package com.example1;

public class School {

	public static void main(String[] args) {
		
		Student st[]=new Student[5];
		
		st[0]=new Student(11,"shivam",78.8f);
		st[1]=new Student(12,"vishal",88.8f);
		st[2]=new Student(13,"aniket",79.8f);
		st[3]=new Student(14,"suraj",70.8f);
		st[4]=new Student(15,"hrushikesh",80.8f);
		
		for (Student s:st)
		{
		    System.out.println(s);
			
		}

		System.out.println("===============================");
		
		for(int i=0;i<st.length;i++)
			
		{
			System.out.println(st[i]);
		}

	}

}
