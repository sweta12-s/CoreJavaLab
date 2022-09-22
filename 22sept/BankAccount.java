/*
Program : creating class Bank Account 
@author:Sweta Das
@Date : 22 sep 2022

*/


//declaring class BankAccout

class BankAccount
{
	
	// calling main method
	public static void main(String...args){
		// Creating an array of BankAccounts
		BankDetails Bank1[]=new BankDetails[4];
		
		// Constructor injection
		Bank1[0]=new BankDetails(1344,"Sweety",78000);
		Bank1[1]=new BankDetails(5667,"Juhi",45000);
		Bank1[2]=new BankDetails(8899,"Priya",5670);
		Bank1[3]=new BankDetails(7888,"Pinky",7896);
		
		
		
		// running the loop on Bank array
		for(int i=0;i<Bank1.length;i++){
			// storing the amount in variable
			double amount=Bank1[i].getBalance();
			// if amount is less than 1000
			if(amount<1000){
				// print BankAccount details
				System.out.println("BankAccount "+i);
				System.out.println("The BankAccount id is : "+Bank1[i].getAccId());
				System.out.println("The BankAccount holder is : "+Bank1[i].getAccName());
				System.out.println("The  balance is : "+Bank1[i].getBalance());
			} // if ends 
			
		} // for loop ends
		
	} //main method ends 
	
}// Bankaccout class ends