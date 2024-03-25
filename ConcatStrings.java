package com.string;
import java.util.Scanner;
public class ConcatStrings
{
	  public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the first string: ");     
	        String firstString = scanner.nextLine();

	        
	        System.out.print("Enter the string to concatenate: ");     
	        String secondString = scanner.nextLine();

	        
	        String concatenatedString = firstString.concat(secondString);   // Concatenate the strings

	        
	        System.out.println("Concatenated string: " + concatenatedString);

	        
	    }
	}


