/*program : Write a  java program to create a BankAccount and display the people with balance less than 1000.
@author : Sweta Das
@date : 22sept 2022
*/
import java.util.*;

//declaring class 
class BankDetails
{
	
	//instance variable
	public int accId;
	private String accName;
	private double balance;
	
	
	BankDetails()           // no arg constructor
	{
		
	}
	

	//paramaterized constructor
	BankDetails(int accId, String accName, double balance)
	{
		this.accId = accId;
		this.accName = accName;
		this.balance = balance;
	}
	
	
	
	//method to insert BankDetails
	void insertBankDetails()
  {
	  Scanner sc= new Scanner(System.in);    //for taking input
	  
	   System.out.println("Enter the details of Bank:");          //printing bank details
	   
	   System.out.println("Account id:");          //printing account id
	   this.accId= sc.nextInt();
	   
		System.out.println("Account holder :");              //printing account name
		this.accName= sc.next();
		
		System.out.println("Balance :");              //printing balance
		this.balance= sc.nextDouble();
		
		
    
  }
  
  //method to display Bank details
  void displayBankDetails()
  {
    System.out.println("Account Id:"+ this.accId+"    "+ "Account holder:"+ this.accName+ "   "+"Balance:"+this.balance);
  }

	// Setter and getter 
	

	public void setAccId(int accid)            
	{
		this.accId=accId;
	}
	
	public int getAccId()
	{
		return this.accId;
	}
	
	public void setAccName(String accName)            
	{
		this.accName=accName;
	}
	
	public String getAccName()
	{
		return this.accName;
	}
	
	public void setBalance(double balance)            
	{
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
}

//end of class bank details

	