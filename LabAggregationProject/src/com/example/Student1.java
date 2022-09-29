
//declaring package
package com.example;

//declaring main class Student1

public class Student1 {

	// instance variable
	private int slNo;
	private String name;
	private Address1 addre;

	// declaring default constructor
	public Student1() {
		super(); // super keyword
		// TODO Auto-generated constructor stub
	}

	// declaring paramiterized constructor
	public Student1(int slNo, String name, Address1 addre) {
		super();
		this.slNo = slNo;
		this.name = name;
		this.addre = addre;
	}

	// generate getter and setter
	public int getSlNo() {
		return slNo;
	}

	public void setId(int slNo) {
		this.slNo = slNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address1 getAddre() {
		return addre;
	}

	public void setAddre(Address1 addre) {
		this.addre = addre;
	}

	// generate string()
	@Override
	public String toString() {
		return "Student1 [slNo=" + slNo + ", name=" + name + ", addre=" + addre + "]";
	}

}// end main class Student1
