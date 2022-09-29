//declaring package com,example
package com.example;

//declaring main class studentInformation
public class StudentInformation {
	static void display(Student1 st) // declaring the method passing object
	{

		System.out.println(st); // printing st

	}

	// declaring main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// constructor injection
		Student1 st1 = new Student1(21, "Sweta", new Address1("GH 23", "Kolkata", 700082, "West Bengal", "India"));
		Student1 st2 = new Student1(16, "Sweety", new Address1("DTH 18", "Delhi", 700059, "Delhi", "India"));

		System.out.println("Details are:"); // printing details are

		display(st1); // displaying st1
		display(st2); // displaying st2

	} // end main method
} // end main class StudentInformation
