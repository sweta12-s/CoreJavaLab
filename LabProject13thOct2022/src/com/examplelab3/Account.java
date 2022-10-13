/*Labques3 :Create a Account and perform synchronized withdrawal in it using Threads	
 * Author: Sweta Das
 * Date: 13.10.2022
 */

//declaring package 
package com.examplelab3;

//declaring class Account
public class Account {

	private int balance = 1500; // initializing variable

	public int getBalance() {
		return balance;
	}

	public void withDrawl(int amount) {
		balance = balance - amount;
	}

}
//end of class Account
