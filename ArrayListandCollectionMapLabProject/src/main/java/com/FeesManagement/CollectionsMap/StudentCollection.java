//declaring package
package com.FeesManagement.CollectionsMap;

//importing hashmap
import java.util.HashMap;
//importing Scanner class
import java.util.Scanner;

//declaring class StudentCollection
public class StudentCollection {

	// declaring main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating a hashmap
		HashMap<String, Student> sDetails = new HashMap<>();

		String uniqueID;

		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// creating Student object
		Student sInfo = new Student();

		// printing
		sDetails.put("MIT101", new Student(01, "Riya Sen", "AI", 1600, "FULLY PAID"));
		sDetails.put("BCE102", new Student(02, "Sweety Banerjee", "C++", 2000, "FULLY PAID"));
		sDetails.put("JIT103", new Student(03, "Rahul Gupta", "BASIC PROGRAMMING IN C", 0, "NOT PAID"));
		sDetails.put("NTK104", new Student(04, "Sreya Roy", "AI IN PYTHON", 3000, "PARTIALLY  PAID"));
		sDetails.put("HTP105", new Student(05, "Sijita Gupta", "PROGRAMMING IN C", 0, "NOT PAID"));
		sDetails.put("PMRDT106", new Student(06, "Avinash Sen", "JAVA", 1400, "PARTIALLY PAID"));
		System.out.println("-----------------------------------");
		System.out.println("----FEES  MANAGEMENT OF STUDENT------");
		System.out.println("-----------------------------------");

		System.out.println("Enter the student UNIQUE ID :");
		uniqueID = sc.next();

		// check : Student is present or not
		boolean status = sDetails.containsKey(uniqueID);

		// displaying the information

		if (status) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("----------------STUDENT  INFORMATION AS PER DATABASE-------------");
			System.out.println("-------------------------------------------------------------");
			sInfo = sDetails.get(uniqueID);
			System.out.println(sInfo);
		}
		// end of if

		else {
			System.out.println("-------------------------------------------------------------------");
			System.out.println("----------------STUDENT  INFORMATION NOT FOUND IN DATABASE-------------");
			System.out.println("-------------------------------------------------------------------");
		}
		// end of else

		sc.close();

		// end sc

	}
	// end of main method

}

// end of class Student Collection
