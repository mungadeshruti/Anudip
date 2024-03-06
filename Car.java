// write a java program class and object 
package com.demo;

public class Car    // Create a class
{
String make;     //These are member variable & attribute
String model;   //These are member variable & attribute
int year;      //These are member variable & attribute

public Car(String make,String model, int year)   // this is the constructor method
{
	this.make = make;       // Value passed
	this.model = model;    // Value passed
	this.year = year;     // Value passed
}

public void displayInfo()   //method to display
{
	System.out.println("Make:" + make);      //printing the make ,model , year
	System.out.println("Model:" + model);   //printing the make ,model , year
	System.out.println("Year:" + year);    //printing the make ,model , year
}
	public static void main(String[] args) //this is the main method
	{
		Car myCar = new Car("Toyota","Corolla",2024);  // create a object of a car class
		myCar.displayInfo();                           //Calling the display method
	}

}
