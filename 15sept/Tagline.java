/*Program :
Write a java program to print the tagline of any 5 companies (Enahnced switch case).
@author : Sweta das
@date : 15sept 2022
*/

import java.util.Scanner;

//declaring class
class Tagline
{
	//Calling main
	public static void main(String args[])     
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the company name "); //printing the company name
		String company = sc.next();     // taking String input
		
		
		//Start Enhanced Switch case
		switch (company) 
		{
		case "Nike" -> System.out.println("The company tagline is "+company+". Just do it.");
		case "Samsung" -> System.out.println(" The company tagline is "+company+". Do what you can't.");
		case "BMW" -> System.out.println("The company tagline is "+company+". The ultimate driving machine .");
		case "Uber" -> System.out.println(" The company tagline is "+company+". Move the way you want .");
		case "Allstate" -> System.out.println(" The company tagline is "+company+". You're in good hands.");
		default -> System.out.println("Nothing to show");
		}
		//end of switch case
		
	}
	
	//end of main 
}

//end of class Tagline