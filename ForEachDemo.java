package com.corejava.demo;

public class ForEachDemo {

	

	public static void main(String[] args) {
		int[] marks= {12, 4, 5};
		System.out.println("Using For-each Loop");
				for(int a: marks); //a=0; a<marks; i++
				{
					System.out.println(a);
				}
	}

}
