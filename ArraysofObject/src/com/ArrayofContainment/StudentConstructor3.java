package com.ArrayofContainment;

public class StudentConstructor3 {

	static void countConstructorCountwise(Student[] st, Course[] cour) {

		int count;
		for (Course c : cour) {
			count = 0;
			for (Student s : st) {
				if (s.getCourse().equals(c)) {
					count++;
				}
			}

			System.out.println(c + "  " + count);
		}

	}

	public static void main(String[] args) {

		Course co[] = new Course[3];

		co[0] = new Course(101, "java", 35000);

		co[1] = new Course(102, "paython", 25000);

		co[2] = new Course(103, ".net", 34000);

		Student stud[] = new Student[6];

		stud[0] = new Student(1, "shivam", co[0]);
		stud[1] = new Student(2, "shubham", co[1]);
		stud[2] = new Student(3, "abhi", co[2]);

		stud[3] = new Student();

		stud[3].setId(4);
		stud[3].setName("amit");
		stud[3].setCourse(co[1]);

		stud[4] = new Student(5, "anil", co[2]);
		stud[5] = new Student(6, "karan", co[1]);

		for (Student s : stud) {
			System.out.println(s);
		}

		countConstructorCountwise(stud, co);

	}

}
