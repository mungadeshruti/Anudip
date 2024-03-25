package com.string;
import java.util.Scanner;
public class Character 
{
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);	

	//Input string
	System.out.println("Enter a string");
	String str = scanner.nextLine();
	
	//Input Index
	System.out.println("Enter a index");
	int index = scanner.nextInt();
	
	//check the index is valid
	if(index >= 0 && index < str.length()) 
	{
	char charater = str.charAt(index);	
	System.out.println("Character at index" + index +" is: " + charater);
	}
	else
	{
		System.out.println("Invalid index");
	}
	scanner.close();
	}
}