/*labQues4:Create a class Employee. Inherit 2 classes Hourly employee
 *  and Salaried Employee  and functionality . Create a test class
 *  author: sweta Das
 *  date: 13.10.22
 */

//declaring package
package com.examplelab2;

//declaring class Employee
public class Employee {

	// properties of Empolyee details
	private int emplId;
	private String emplName;
	protected double emplSalary;
	private int emplPhNo;

	// default constructor
	public Employee() {
		super();
	}

	// parameterized constructor
	public Employee(int emplId, String emplName, int emplPhNo) {
		super();

		// initializing variables
		this.emplId = emplId;
		this.emplName = emplName;
		this.emplPhNo = emplPhNo;
	}

	// getter and setter
	public int getEmplId() {
		return emplId;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}

	public String getEmplName() {
		return emplName;
	}

	public void setEmpName(String emplName) {
		this.emplName = emplName;
	}

	public double getEmplSalary() {
		return emplSalary;
	}

	public void setEmplSalary(double emplSalary) {
		this.emplSalary = emplSalary;
	}

	public int getEmplPhNo() {
		return emplPhNo;
	}

	public void setEmplPhNo(int emplPhNo) {
		this.emplPhNo = emplPhNo;
	}

	// calculate of emplSalary
	public void calculateEmplSalary(int timeDuration) {
		this.emplSalary = 0.0; // initialize value 0.0
	}
	//
}
//end of class of Employee