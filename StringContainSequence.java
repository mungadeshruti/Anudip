package com.string;

public class StringContainSequence 
{
	public static void main(String[] args)
	{
		//Given string
		String originalString = "Hello Anudip";
		
		// Specified sequence of characters to check
		String sequenceToCheck = "Anudip";
		
	    // Test if the original string contains the specified sequence
		boolean containSequence = originalString.contains(sequenceToCheck);
		
		//print the result
		if (containSequence)
		{
			System.out.println("The original string contains the specified sequence");		
		}
		else
		{
			System.out.println("The oringinal string does not contain the specified sequence");
		}
	}
}
