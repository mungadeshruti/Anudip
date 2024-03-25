package com.string;
import java.util.Scanner;
public class StringContain
{
	 public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the string: ");     
	        String inputString = scanner.nextLine();

	       
	        System.out.print("Enter the sequence of characters : ");   
	        String sequence = scanner.nextLine();

	        
	        boolean containsSequence = inputString.contains(sequence);    // Checking the string contains the specified sequence

	        if (containsSequence) 
	        {
	            System.out.println("The string contains  sequence of characters.");
	        } 
	        else 
	        {
	            System.out.println("The string does not contain  sequence of characters.");
	        }

	       
	    }
	}



