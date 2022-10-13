//declaring package
package com.examplelab2;

//declaring class HourlyEmployee
public class HourlyEmployee extends Employee {

	// default constructor
	public HourlyEmployee() {
		super();
	}

	// parameterized constructor
	public HourlyEmployee(int emplId, String emplName, int emplPhNo) {
		super(emplId, emplName, emplPhNo);
	}

	@Override
	public void calculateEmplSalary(int numOfHours) {

		this.emplSalary = numOfHours * 600; // calculating no of hours* salary
	}

}
//end class HourlyEmployee
