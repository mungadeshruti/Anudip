package com.string;

public class StringComparison 
{
	public static void main(String[] args) 
	{
		// Given string
        String originalString = "Hello ASM";

        // Specified character sequence to compare
        String sequenceToCompare = "Hey";

        // Compare the original string with the specified sequence
        boolean isEqual = originalString.equals(sequenceToCompare);

        // Print the result
        if (isEqual)
        {
            System.out.println("The original string is equal to the specified sequence.");
        }
        else 
        {
            System.out.println("The original string is not equal to the specified sequence.");
        }
	}
}
