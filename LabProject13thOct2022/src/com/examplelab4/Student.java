package com.examplelab4;

public class Student {
	// main method
	public static void main(String[] args) {

		String name = null;
		String id = "2";

		// try catch for name
		try {
			checkName(name);
		} catch (NullPointerException e) {
			System.out.println("exception occured " + e);
		}

		// try catch for ID
		try {
			checkID(id);
		} catch (NullPointerException e) {
			System.out.println("exception occured " + e);
		}
	}
	// end main method

	// checking name
	static void checkName(String name) throws NullPointerException {

		if (name == null) {
			throw new NullPointerException("\n" + "Name cannot be null");
		} else {
			System.out.println("Student name: " + name); // printing name
		}
	}
	// end method of checking name

	// method to checking ID
	static void checkID(String id) throws NullPointerException {

		if (id == null) {
			throw new NullPointerException("\n" + "ID cannot be null");
		} else {
			System.out.println("Student ID: " + id); // printing id
		}
	}
	// end method checking ID
}
// end of class Student