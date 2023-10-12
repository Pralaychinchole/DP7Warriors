package comArrayofContainment2;

public class DepartemtConstructor {

	static void countofDepartment(Employee[] em, Department[] de) {
		int count;
		for (Department d : de) {
			count = 0;
			for (Employee e : em) {
				if (e.getDepartment().equals(d)) {
					count++;
				}
			}

			System.out.println(d+ "-------" + count);
		}

	}
	
	
	public static void main(String[] args) {

		Department dep[] = new Department[3];

		dep[0] = new Department(101, "phisics");
		dep[1] = new Department(102, "chemistry");
		dep[2] = new Department(103, "Bio");

		Employee emp[] = new Employee[6];

		emp[0] = new Employee(1, "pralay", 50000f, dep[1]);
		emp[1] = new Employee(2, "shivam", 67000f, dep[0]);
		emp[2] = new Employee(3, "pratik", 76000f, dep[1]);
		emp[3] = new Employee(4, "aniket", 87000f, dep[0]);
		emp[4] = new Employee(5, "aditya", 67000f, dep[2]);
		emp[5] = new Employee(6, "hrushi", 45000f, dep[2]);

		for (Employee e : emp) {
			System.out.println(e);
		}
        
		System.out.println("count employee and department-----------");
		
		countofDepartment(emp, dep);
		
	}

}
