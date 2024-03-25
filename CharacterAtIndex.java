package com.string;
import java.util.Scanner;
public class CharacterAtIndex 
{
	 public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a string: ");        
	        String inputString = scanner.nextLine();

	        
	        System.out.print("Enter the index to get the character from: ");     
	        int index = scanner.nextInt();

	        
	        if (index >= 0 && index < inputString.length())    // Check if the index is valid   index start from 0
	        {
	            char character = inputString.charAt(index);
	            System.out.println("Character at index " + index + " is: " + character);
	        }
	        else 
	        {
	            System.out.println("Invalid index. Please enter an index within string length.");
	        }

	       
	    }
	}
