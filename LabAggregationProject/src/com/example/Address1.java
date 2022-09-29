/*Author: Sweta Das
 * date :29.09.2022
 */

//declaring package com.example
package com.example;

//declaring class Address1
public class Address1 {

	// instance variable
	private String addressline;
	private String city;
	private int pincode;
	private String state;
	private String country;

	// declaring default constructor
	public Address1() {
		super(); // super keyword
		// TODO Auto-generated constructor stub
	}

	// declaring parameterized constructor
	public Address1(String addressline, String city, int pincode, String state, String country) {
		super();
		this.addressline = addressline;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	// generate getter and setter
	public String getAddressline() {
		return addressline;
	}

	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// generate string()
	@Override
	public String toString() {
		return addressline + " " + city + "  " + pincode + "  " + state + " " + country;
	}

} // end of main class Address1
