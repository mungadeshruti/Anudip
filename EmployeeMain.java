package com.javademo;

import com.javademo.EmpMain.Employee;

/*
 * Abstraction In Java
 * In the Computer Science perspective,
 * Abstraction is the process of separating idea from their action
 */
class Employee1
{
	void salary() {
	} //method declaration
	void leave()
	{
		
	}
}

class PermanantEmployee extends Employee
{
	void salary()//method definition(body is given)
	{
		System.out.println("Bsic+Bonus+leave+HRA");
	}
}
class TemEmployee extends Employee1
{
	void salary()
	{
		
	}
	System.out.println();
}
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
