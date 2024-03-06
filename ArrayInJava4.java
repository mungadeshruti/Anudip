package com.corejava.demo;

public class ArrayInJava4 
{

	public static void main(String[] args)
	{
		//Declaring and initializing an aaray of ints
		int[] a= {12, 21, 0, 5, 7};
		
		int[] b=a.clone();
		
		for(int i=0; i<b.length;i++)
		{
		a[0] = 56;
		System.out.println(b[2]);
		b[4] = 100;
		System.out.println(a[4]);
		}
	}

}
