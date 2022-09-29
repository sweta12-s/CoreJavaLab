/* Author: Sweta Das
 * Date: 29.09.22
 */

//declaring package com.example
package com.example;

//declaring main class EvenOdd
public class EvenOdd {

	public static int sumOfEven(int... x) // int variable
	{
		int sumOfEven = 0; // initializing value
		for (int i : x) // first loop
		{
			if (i % 2 == 0) // if the value is ==0
			{
				sumOfEven += i; // sum of even numbers
			}
		} // loop end
		return sumOfEven; // return the even numbers
	} // end method

	public static int sumOfOdd(int... x) // int variable
	{

		int sumOfOdd = 0; // initializing value
		for (int i : x) // loop
		{
			if (i % 2 != 0) // if the value is not equal 0
			{
				sumOfOdd += i; // sum of odd numbers
			}
		} // end loop
		return sumOfOdd; // return odd numbers
	} // end method

	public static void main(String[] args) // declaring main method
	{
		// TODO Auto-generated method stub

		System.out.println("Sum of even Numbers: " + sumOfEven(2, 4, 20, 64, 24, 10));
		// printing the sum of even numbers
		System.out.println("Sum of odd Numbers: " + sumOfOdd(3, 5, 7, 33, 91, 11));
		// printing the sum of odd munbers

	} // end of main method
} // end of main class EvenOdd
