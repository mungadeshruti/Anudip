package com.corejava.demo;

public class ArrayInJava8 {
	static void methodOne(double d[])
	{
		d[2]=25.35;  //Changing the value of element at index 2
		d[5]=45.35;  //Changing the value of element at index 5
	}

	public static void main(String[] args) {
		
		//declaring and creating An array object of double type containing 8 elements
				double[] d=new double[8];
				d[2]=10.25;  //Changing the value of element at index 2
				d[5]=15.25;  //Changing the value of element at index 5
				
				methodOne(d);  //Passing array to methodOne()
				System.out.println(d[2]);
				System.out.println(d[5]);

	}

}
