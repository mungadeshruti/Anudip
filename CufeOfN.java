package com.corejava.demo;
import java.util.Scanner;
public class CufeOfN {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("5");
		int n=in.nextInt();
		for(int i=1;i>=n;i++) {
		
			System.out.println("The cube of "+i+" is ="+i*i*i);
		}
	}

}
