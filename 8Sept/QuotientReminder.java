/* program : Java program to find Quotient and Reminder(take input)
@author : Sweta Das
@Date : 8 sept 2022
*/

// Declaring a class
class QuotientReminder
{
	
	
	// calling main
	public static void main(String[] args)
	{
		float divisor= Float.parseFloat(args[0]); //taking input
		float dividend= Float.parseFloat(args[1]);
		float quotient=dividend/divisor;
		int reminder= (int) (dividend%divisor);
		System.out.println("the Quotient is :"+quotient); // printing quotient value
		System.out.println("The Reminder is :"+reminder);  //printing reminder value
	}
	
	// end of main
}

// end of class QuotientReminder
