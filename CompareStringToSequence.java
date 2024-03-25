package com.string;
import java.util.Scanner;
public class CompareStringToSequence
{
	 public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the string: ");         
	        String inputString = scanner.nextLine();

	        
	        System.out.print("Enter the character sequence to compare: ");    
	        String sequence = scanner.nextLine();

	        
	        boolean isEqual = inputString.equals(sequence);			//  to Compare the string to the character sequence

	        if (isEqual) 
	        {
	            System.out.println("The string is equal to character sequence.");
	        } 
	        else 
	        {
	            System.out.println("The string is not equal to character sequence.");
	        }

	       
	    }
	}

