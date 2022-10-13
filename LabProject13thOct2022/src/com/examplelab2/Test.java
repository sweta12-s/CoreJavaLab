//declaring package 
package com.examplelab2;

//declaring class Test
public class Test {

	// calling main method
	public static void main(String[] args) {

		// creating Hourly Employee
		System.out.println(" Hourly Employee ----------"); // printing

		HourlyEmployee e1 = new HourlyEmployee(1, "Sweta", 985600988);
		// calling calculateEmpl
		e1.calculateEmplSalary(8);
		// print employee details
		System.out.println("Employee Id is : " + e1.getEmplId());
		System.out.println("Employee Name is : " + e1.getEmplName());
		System.out.println("Employee Salary in a day is : " + e1.getEmplSalary());
		System.out.println("Employee Phone Number is : " + e1.getEmplPhNo());

		// create salaried
		System.out.println("\n Salaried Employee ----------"); // printing
		SalariedEmployee e2 = new SalariedEmployee(2, "Rahul", 879659990);

		// calling calculateEmpl
		e2.calculateEmplSalary(10);

		// print employee details
		System.out.println("Employee Id is : " + e2.getEmplId());
		System.out.println("Employee Name is : " + e2.getEmplName());
		System.out.println("Employee Salary in a month is : " + e2.getEmplSalary());
		System.out.println("Employee Phone Number is : " + e2.getEmplPhNo());

		// create salaried
		System.out.println("\n Salaried Employee ----------"); // printing
		SalariedEmployee e3 = new SalariedEmployee(3, "Rahul", 564738800);
		// calling calculateEmpl
		e3.calculateEmplSalary(5);

		// print employee details
		System.out.println("Employee Id is : " + e3.getEmplId());
		System.out.println("Employee Name is : " + e3.getEmplName());
		System.out.println("Employee Salary in a month is : " + e3.getEmplSalary());
		System.out.println("Employee Phone Number is : " + e3.getEmplPhNo());

	}
	// end of main method

}
//end of class Test
