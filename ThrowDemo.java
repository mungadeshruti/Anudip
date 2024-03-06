package com.demo;
/*The Throwable class is the superclass of all errors and exceptions in the Java language. 
 * Only objects that are instances of this class (or of one of its subclasses) are thrown by the Java Virtual Machine or can be thrown by the Java throw statement.
 
 * ArithException ae=new ArithmeticException()//object
 * ArithmeticException ae;                   //reference variable
 * new arithmeticException                   //instance of a class
 */
public class ThrowDemo 
{
void validate(int age) 
{
	if(age<18)
	throw new ArithmeticException("age is not valid");	//throw instance of a class (Arithmetic
	else
		System.out.println("ur are eligible foe voting");
}
	public static void main(String[] args)
	{
		ThrowDemo td=new ThrowDemo();
		try
		{
			td.validate(13);
		}
		catch(ArithmeticException ae)
		{

			System.out.println("Welcome to Voting");
		}
			System.out.println("mai bhi excute ho raha hai");
		
		

	}

}
