package com.corejava.demo;

public class ArrayInJavaPractice {

	public static void main(String[] args) {
		int[] a= {14, 22, 0, 7, 9};
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		
		for(int i=0; i<b.length;i++);
		{
			int i = 0;
			System.out.println(b[i]);
		}

	}


	}


