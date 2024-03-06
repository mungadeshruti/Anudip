package com.javademo;

public class TypeCasting {
	public static void main(String[] args) {
		byte i = 0;      // this is a variable 
		Byte i1=0;   // 
		@SuppressWarnings("removal")
		Byte b=new Byte(i); //Byte type of a object
		int j;
		
		j=i; // automatic coversion of data
		//Implicit type casting

		int a=10;// 4 byte 
		
		byte b1;
		
		b1=(byte)a; //explicit conversion of data
		
	// Explicit casting 
		System.out.println(b1);
		
		
		
	}

}


