package Com.Demoproject;

import java.util.Scanner;

public class EmployeeImplimentaion  implements EmployeeDeatail {
	
		Scanner sc=new Scanner(System.in);
	Employee e[]=new Employee[10];
		int id,salary;
		String name;
		int count=0;

		@Override
		public void addEmployee() {
			System.out.println("Add Employee");
			
			System.out.println("Enter number of Employee you want to add");
			int a=sc.nextInt();
			
			for(int i=0;i<a;i++)
			{
				System.out.println("Enter Employee id");
				 id=sc.nextInt();
				System.out.println("Enter Employee name");
				name=sc.next();
				System.out.println("Enter Employee salary");
				salary=sc.nextInt();
				
				e[count]=new Employee(id,name,salary);
				count++;
			}
			System.out.println("Add Employee in company Sucessfully");
			
		}

		@Override
		public void UpdateEmployeedatil()
		{
			System.out.println("Update Employee");
			  System.out.println("Enter the Employee id you want to Update");
			  int id=sc.nextInt();
			  for(int i=0;i<count;i++)
				{
			         if(name==e[i].getName() && e[i]!=null)
			         {
			        	 System.out.println("Enter Employee name");
			        	 name=sc.next();
			        	 e[i].setName(name);
			    
			        	 System.out.println("Enter Employee Salary");
			        	 salary=sc.nextInt();
			        	 e[i].setSalary(salary);
			         }
				}
			  System.out.println("Employee detail Update Sucessfully");
			
			
		}

		@Override
		public void showEmployeedetail() {
			// TODO Auto-generated method stub
		
				for(int i=0;i<count;i++)
				{
					if(e[i]!=null)
					{
					System.out.println(e[i]);
					}
					
				}
				
			}

		

		@Override
		public void deleteEmployee() {
			// TODO Auto-generated method stub
			System.out.println("Delete Employee detail");
			  System.out.println("Enter Employee id you want to delete");
			  int id=sc.nextInt();
			  for(int i=0;i<count;i++)
				{
			         if(id==e[i].getId())
			         {
			        	 e[i]=null;
			         }
			         
				}
			  System.out.println("Employee delete  Sucessfully in Company detail");
			  
				
			}


		

		@Override
		public void searchEmployee() {
			// TODO Auto-generated method stub
			System.out.println("Search Employee ");
			  System.out.println("Enter the book id you want to search");
			  int id=sc.nextInt();
			  int flag=0;
			  int i;
			  for( i=0;i<count;i++)
				{
			         if(e[i].getId()== id&& e[i]!=null)
			         {
			        	 flag=1;
			        	 break;
			
		              }

	              }
			  if(flag==1)
			  {
				  System.out.println("The Employee is Work in Company");
				  System.out.println(e[i]);
			  }
			  else
				  System.out.println("the Employee is not work in company");
	

		}
	}
