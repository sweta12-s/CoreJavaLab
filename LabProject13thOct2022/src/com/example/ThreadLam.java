/* LabQues1: Create a thread using Lambda
 * Author: Sweta Das
 * Date: 13.10.22 
 */

//declaring package
package com.example;

//declaring class ThreadLam
public class ThreadLam {

	// declaring main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread without lambda
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " :thread is running");
			}
		};
		Thread p1 = new Thread(r1, "Sweta"); // creating object
		System.out.println("Without Lambda..."); // printing
		p1.start(); // start thread

		// Thread with lambda
		Runnable r2 = () -> {
			System.out.println(Thread.currentThread().getName() + " :thread is running");
		};
		Thread p2 = new Thread(r2, "Sw e ta in cl a ss"); // creating object
		System.out.println("With Lambda...."); // printing
		p2.start(); // start thread
	}
	// end main method
}

//end class Threadlam
