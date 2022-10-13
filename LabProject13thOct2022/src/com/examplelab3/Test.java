
//declaring package
package com.examplelab3;

//declaring class Test
public class Test extends Thread {

	Account a1 = new Account(); // creating object

	// declaring main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test acc = new Test();
		Thread t1 = new Thread(acc, "Sweta");
		Thread t2 = new Thread(acc, "Rahul");

		t1.start(); // starts thread
		t2.start();

	}

	// end main method

	synchronized void MakeWithDrawl(int amt) {

		if (a1.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to wihtdrawl amount: " + amt);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a1.withDrawl(amt);
			System.out.println(Thread.currentThread().getName() + " has wihtdrawl amount: " + amt);
		} else {
			System.out.println(Thread.currentThread().getName() + " is not having enough money" + amt);
			System.out.println("The amount is " + a1.getBalance());

		}
	}

	public void run() {
		MakeWithDrawl(300);
		if (a1.getBalance() < 0) {
			System.out.println("overdrawn");

		}
	}
}
//end class Test
