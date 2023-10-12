package Example2;

public class StudentTest {

	public static void main(String[] args) {
		
		Student st[]=new Student[3];
		
		float m1[]= {67.4f,89.5f,90.6f};
		st[0]=new Student(101,"vaibhav",m1);
		
		float m2[]= {23.5f,87.7f,78.9f};
		st[1]=new Student(102,"sneha",m2);
		
		float m3[]= {23.5f,67.7f,98.9f};
		st[2]=new Student(103,"hrushi",m3);
		
		System.out.println("--------------------------");
		for(Student s:st)
		{
			System.out.println(s);
		}

	}

}
