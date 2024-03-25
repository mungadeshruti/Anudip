package com.string;
public class StringFromCharArray 
{
	public static void main(String[] args)
	{
		 // Define a character array
        char[] charArray = {'A', 'N', 'U', 'D', 'I', 'P', ',',' ', 'F', 'O', 'U', 'N', 'D', 'A', 'T', 'I', 'O', 'N',};

        // Create a String object from the character array
        String str = new String(charArray);

        // Print the created String object
        System.out.println("String created from character array: " + str);
    }
}


