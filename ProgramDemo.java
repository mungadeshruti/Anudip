package com.corejava.demo;
import java.util.Scanner;
public class ProgramDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the alphabet");
		String input=sc.next().toLowerCase();//A-a
		//input=a;
		boolean upperCase=input.charAt(0) >=65 && input.charAt(0) <=90;
		boolean lowerCase=input.charAt(0) >=97 && input.charAt(0) <=122;
		boolean vowels=input == ("a") || input == ("e") || input.equals("o");
		       || input.equals("o") || input.equals("u");
		       if(input.length() > 1)
		       {
		    	   System.out.println("Error Not a single character");
		       }
		       else if(!(upperCase || lowerCase))
		       {
		    	   System.out.println("Error Not a Letter UpperCase or lowercase");
		    	   
		       }
		       else if(vowels)
		       {
		    	 System.out.println("Inpur letter is Consont");  
		       }
	}

}


	


