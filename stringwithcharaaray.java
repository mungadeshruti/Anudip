package com.string;

public class stringwithcharaaray
{
	public static void main(String[] args)
    {
       
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};     // Character array

       
        String str = new String(charArray);     // Create String object of  Character Array

        
        System.out.println("String created from character array: " + str);    // Print String object
    }
}


