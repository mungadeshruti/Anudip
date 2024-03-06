package com.corejava.demo;
import java.util.Scanner;
public class TableDemo {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter any number");
		Scanner r=new Scanner(System.in);
		num=r.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+"*"+i+"="+num*i);	
		}

		}

	}

	


