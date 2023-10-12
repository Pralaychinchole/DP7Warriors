package ExampleNumber3;

public class Employee2 {

	static void highestSalary(Employee emp[]) {
		float maxsalary = Float.MIN_VALUE;
		Employee e1 = new Employee();

		for (Employee e : emp) {
			if (e.getSalary() > maxsalary) {
				maxsalary = e.getSalary();
				e1 = e;

			}

		}
		System.out.println(e1);

	}

	static void sortSalary(Employee emp[]) {
		Employee e1 = new Employee();

		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++)
			
			{
				if(emp[i].getSalary()<emp[j].getSalary())
				{e1 = emp[i];
				emp[i] = emp[j];
				emp[j] = e1;
				}
			}

		}

	}

	public static void main(String[] args) {

		Employee e1[] = new Employee[5];

		e1[0] = new Employee(11, "pralay", 45000f);
		e1[1] = new Employee(12, "Aniket", 78000f);
		e1[2] = new Employee(13, "shivam", 90000f);
		e1[3] = new Employee(14, "sumit", 87000f);
		e1[4] = new Employee(15, "Aditya", 92000f);

		for (int i = 0; i < e1.length; i++) {
			System.out.println(e1[i]);
		}

		System.out.println("------------------------");
		System.out.println("highest salary employee");

		highestSalary(e1);

		System.out.println("---------------------------");
		System.out.println("---------sort employee- salary desending -------");

		sortSalary(e1);
		for (int i = 0; i < e1.length; i++) {
			System.out.println(e1[i]);
		}

	}

}
