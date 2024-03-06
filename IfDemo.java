package com.corejava.demo;

import java.util.Scanner;

public class IfDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new
				Scanner (System.in);
		System.out.println("20");
		int i = sc.nextInt();
		int i =sc.nextInt();
		
		//int i=20;
		if(i ==10)
		{
			System.out.println("i is 10");	
		}
		{
			else if(i == 15)
			{
				System.out.println("i is 15");
				
			}
			else if(i == 20)
			{
				System.out.println("i is 20");	
			}
			else
			{
				System.out.println("i is not present");
			}
		}
	}
}

		
	
	
	