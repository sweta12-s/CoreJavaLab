/*Lab ques2 : Create  a HashMap to store the fees submitted by student .The key of the Map will be Student Id.
Create a method to find a student using the ID."

@Author: Sweta Das
@Date: 26.10.22
*/

//declaring package
package com.FeesManagement.CollectionsMap;

//declaring class Student
public class Student {

	// instance variables
	private int stId;
	private String stName;
	private String course;
	private double feesAmount;
	private String feesStatus;

	// constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Student(int stId, String stName, String course, double feesAmount, String feesStatus) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.course = course;
		this.feesAmount = feesAmount;
		this.feesStatus = feesStatus;
	}

	// getters ans setters
	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFeesAmount() {
		return feesAmount;
	}

	public void setFeesAmount(double feesAmount) {
		this.feesAmount = feesAmount;
	}

	public String getFeesStatus() {
		return feesStatus;
	}

	public void setFeesStatus(String feesStatus) {
		this.feesStatus = feesStatus;
	}

	// toString method

	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", course=" + course + ", feesAmount=" + feesAmount
				+ ", feesStatus=" + feesStatus + "]";
	}

}
//end of class Student