package com.demo.set5;

public class TypeCastingObject {
	 static class Manager
	{
		void getSalary()
		{
			System.out.println("Manager salary is 1000");
		}
	}
	static class Employee extends Manager
		{
			void getSalary()
			{
				System.out.println("Employee salary is 2000");
			}
		}
	

	public static void main(String[] args) {
		Employee e1=new Employee();
		Manager m1=e1;
		m1.getSalary();
		Employee e2=(Employee)m1;
		e2.getSalary();

		
		
		
		
		

	}

}
