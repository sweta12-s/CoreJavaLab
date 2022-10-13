//declaring package 
package com.examplelab2;

//declaring class SalariedEmployee
public class SalariedEmployee extends Employee {

	// default constructor
	public SalariedEmployee() {
		super();
	}

	// parameterized constructor
	public SalariedEmployee(int emplId, String emplName, int emplPhNo) {
		super(emplId, emplName, emplPhNo);
	}

	@Override
	public void calculateEmplSalary(int numOfMonths) {

		this.emplSalary = numOfMonths * 30000; // calculating no of months* salary
	}

}
