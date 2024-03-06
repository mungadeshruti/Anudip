package com.corejava.demo;

public class OperatoraDemo {

	public static void main(String[] args) {
		
		int a=10;
		int b=3;
		int c=5;
		int result=a+b;
		//Arithmetic Operator
		System.out.println("a + b = " + result);//+ operator a , b are called operands
		System.out.println("a - b = " + (a - b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a % b = " + (a % b));
		
//Relational Operator
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a <= b = " + (a <= b));
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
//Bitwise operator
		int m=60;  
int n=13; 
result=m & n;
System.out.println(result);

result=m | n;
System.out.println(result);

result=m ^ n;
System.out.println(result);

result=m & n;
System.out.println(result);

result=m >> 2; // 15
System.out.println("m >> 2" + result);

result=m << 2; // 15
System.out.println("m << 2" + result);

//Ternary Operator
int min=(a<b)? a : b;
System.out.println(min);

//Assignment/Complex Operator
System.out.println("a=a+b " + (a +=b)); 
System.out.println("a=a-b " + (a -=b)); 
System.out.println("a=a*b " + (a *=b)); 
System.out.println("a=a/b " + (a /=b)); 

//increment and decrement operators

int x=5;
int z=10;

System.out.println(x);
System.out.println(x++); 
System.out.println(x--);

//preincrement and post increment
System.out.println(++x); 
//pre-increment operator

System.out.println(x++); //post- increment operator

	}

}
