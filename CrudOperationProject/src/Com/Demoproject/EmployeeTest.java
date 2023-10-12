package Com.Demoproject;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;
		EmployeeDeatail ed = new EmployeeImplimentaion();

		System.out.println("Welcome Tata company.........");
		System.out.println("!!!Employee data!!!");

		do {

			System.out.println("1 Add Employee");
			System.out.println("2 Update Employee detail");
			System.out.println("3 Show Employee datail");
			System.out.println("4 Delete Employee from company");
			System.out.println("5 Search Employee deatil");
			System.out.println("6 Exit");

			System.out.println("Enter your choice.......");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				ed.addEmployee();
				break;
			case 2:
				ed.UpdateEmployeedatil();
				break;
			case 3:
				ed.showEmployeedetail();
				break;

			case 4:
				ed.deleteEmployee();
				break;
			case 5:
				ed.searchEmployee();
				break;

			case 6:
				System.exit(0);

			}

		} while (true);

	}

}
