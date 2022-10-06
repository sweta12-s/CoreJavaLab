/* Author : Sweta Das
 * Date : 06.10.22
 * Lab Ques : 1
 */

//declaring package
package com.example;

//import Scanner class
import java.util.Scanner;

//declaring class Palindrome
public class Palindrome {

	// method for checkingPalindrome
	static boolean checkingPalindrome(String str) {

		boolean status; // giving status true or false

		// extracts characters from the string into an array
		char ch[] = str.toCharArray();

		String revstrString = ""; // empty string

		// starting for loop
		for (int i = ch.length - 1; i >= 0; i--) // reverse the input
		{
			revstrString += ch[i];
		} // ending for loop

		// method for comparing
		int flag = str.compareTo(revstrString);
		if (flag == 0) {
			status = true; // giving status true
		} else {
			status = false; // giving status false
		}

		return status;
		// return status
	}
	// end method of checkingPalindrome

	// declaring main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating Scanner object
		Scanner sc = new Scanner(System.in);
		// printing enter the string
		System.out.println("-----------Enter the string -----------");
		String s = sc.next();

		boolean check = checkingPalindrome(s); // calling the method

		if (check) {

			// printing the string is plaindrome
			System.out.println("-----------This is palindrome-----------");
			System.out.println("----------------------");
		} else {

			// printing the string is not palindrome
			System.out.println("-----------This is not palindrome-----------");
			System.out.println("----------------------");
		}
		sc.close();
		// closing sc

	}

	// ending main method

}

//ending class Palindrome
