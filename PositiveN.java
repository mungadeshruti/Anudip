package com.corejava.demo;
import java.util.Scanner;
public class PositiveN {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input any anumber:");
		int n = sc.nextInt();
		
		if(n>=0)
		{
			System.out.println(" number is positive");
		}
		else
		{
			System.out.println(" number is negative");	
		}
		}

	

	}


