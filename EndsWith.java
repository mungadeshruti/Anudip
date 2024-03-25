package com.string;
import java.util.Scanner;
public class EndsWith 
{
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        
        System.out.print("Enter the string to check  it's at the end: ");
        String endString = scanner.nextLine();

        
        boolean endsWith = mainString.endsWith(endString);      // Check if the main string ends with the specified string

        if (endsWith)
        {
            System.out.println("The main string ends with the specified string.");
        } 
        else 
        {
            System.out.println("The main string does not end with the specified string.");
        }

        
    }
}


