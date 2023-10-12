package com.example1;

public class SchoolLogical {

	static void findTopper(Student stud[]) {
		float maxMarks = Float.MIN_VALUE;
		Student st = new Student();

		for (Student s : stud) {

			if (s.getMarks() > maxMarks) {
				maxMarks = s.getMarks();
				st = s;
			}

		}
		System.out.println(st);
	}

	static void sortMarks(Student stud[]) {
		Student st = new Student();

		for (int i = 0; i < stud.length; i++) {
			for (int j = i + 1; j < stud.length; j++) {
				st = stud[i];
				stud[i] = stud[j];
				stud[j] = st;
			}

		}

	}

	public static void main(String[] args) {

		Student st[] = new Student[5];

		st[0] = new Student(11, "shivam", 78.8f);
		st[1] = new Student(12, "vishal", 88.8f);
		st[2] = new Student(13, "aniket", 79.8f);
		st[3] = new Student(14, "suraj", 70.8f);
		st[4] = new Student(15, "hrushikesh", 80.8f);

		

		for (int i = 0; i < st.length; i++)

		{
			System.out.println(st[i]);
		}

		System.out.println("-----------------------------------");
		System.out.println("topper student");

		findTopper(st);

		

		System.out.println("-------------------------------------");
		System.out.println("sorting desending");

		sortMarks(st);
		for (int i = 0; i < st.length; i++)

		{
			System.out.println(st[i]);
		}

	}

}
