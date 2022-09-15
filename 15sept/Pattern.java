/* Program : 1. Java program to print a pattern 		
            *		
           * *		
          * * *		
         * * * *
@author : Sweta Das
@Date : 15 sept 2022
*/		 

//declaring a class
class Pattern
{
	
	//declaring static method of starPattern
	static void starPattern(int noOfRows)
	{
		//outer loop of starPattern rows
		for(int p=1;p<=noOfRows;p++) 
		{
			System.out.println();   //create new line after each row
			
			//inner loop of starPattern 
			for(int space=noOfRows; space>p; space--)
			{
				
				System.out.print(" ");   //printing space 
			}
			//end of inner loop
			
			for(int q=1;q<=p;q++) // this for loop shows the pattern
			{
				System.out.print("* "); //printing starPattern
			}
			
			
		}
		//end of outer loop
		
		
	}
	//end of static method 
	
	
	
	//calling main
    public static void main(String... args)
	{
	  int number =Integer.parseInt(args[0]);  //taking input
	  starPattern(number);    //   declaring starPattern
	}
	//end of main
	
}
//end of class Pattern
	
	
