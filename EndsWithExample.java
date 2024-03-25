package com.string;

public class EndsWithExample
{
	public static void main(String[] args) 
	{
		 // Given strings
        String originalString = "Hello, Shruti";
        String endingString = "Shruti";

        // Check if the original string ends with the ending string
        boolean endsWith = originalString.endsWith(endingString);

        // Print the result
        if (endsWith)
        {
            System.out.println("The original string ends with the ending string");
        }
        else 
        {
            System.out.println("The original string does not end with the ending string");
        }
    }
}

	
