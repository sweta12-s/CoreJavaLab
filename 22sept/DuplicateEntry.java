/*
Program: 1. Write a Java program to print the duplicate entries , Sort the array and then remove the duplicate entry.	
@author: Sweta Das
@date: 22Sept 2022
*/

import java.util.Scanner;
import java.util.Arrays;


//declatring class duplicate entry
class DuplicateEntry
{
	static void inputArray()
	{
		Scanner sc = new Scanner(System.in);          //taking user input
		System.out.println("Enter the no of elements:");           //printing no of elements
		int rows= sc.nextInt();
		
		int arr[]= new int[rows];
		
		System.out.println("Enter the element:");         //printing enter elements
		
		for(int i=0;i<rows;i++)
		{	
	     	arr[i]= sc.nextInt();
		}
		
		
		                  // sorting  elements	
	      int n= arr.length;
		   for(int p = 0;p<n-1;p++){
			   for(int q = 0;q<n-p-1;q++){
				   if(arr[q] > arr[q+1]){
					  int temp = arr[q] ;
					  arr[q] = arr[q+1];
					  arr[q+1] = temp; 
					   
				   }
				   
			   }
			   
		   }	   

		System.out.println();
		
		System.out.println(" elements after sorting");     //printing after sorting elements        
        display(arr);
		
		System.out.println();
		
		System.out.println(" removing Duplicate element...");       //printing removing duplicate elements
        duplicateEntry(arr);
		
	}
	
	
	
	// display
	static void display(int arry[])
	{
		
		System.out.println();
	
		for(int myrow:arry)
		{
		 System.out.print(myrow+ "  ");		
		}
		
	}
	
	
	
   
   static void duplicateEntry(int arry[])
   {
	   int size= arry.length;
	   int new_size;
	   if(size==0||size==1)
	   {
		   new_size=size;
	   }
	   int temp[] = new int[size];
	   int q=0;
	   for(int p=0;p<size-1;p++)
	   {
		   if(arry[p] != arry[p+1])
		   {
			   temp[q++] = arry[p];
		   }
	   }
	   temp[q++]=arry[size-1];
	   
	   //changing original array element
	   for(int p=0; p<q;p++)
	   {
		   arry[p]= temp[p];
	   }
	   
	   //printing after removing duplicate element
	   
	   for(int p=0;p<q;p++)
	   {
		   System.out.print(arry[p]+"  ");
	   }
   }


//declaring main method
   public static void main(String args[])
   {
    inputArray();       //calling function
   }

//ending main method
}

//endeing class 