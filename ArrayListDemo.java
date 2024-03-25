package com.demo; // Package declaration, indicating that this class belongs to the "com.demo" package

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList; // Importing the ArrayList class from the java.util package

// Abstract class: You're referring to abstract classes and interfaces, but there's no such thing in this code.
// This class is not abstract and doesn't implement any interfaces.

public class ArrayListDemo // Class declaration for ArrayListDemo
{
	
	//Linked list is maintaing insertion order
	// Linked list allow the duplicate vlaues	
	//it allows multiple null values.
	//Linked list good for modification
	//but 


    public static void main(String[] args) // Main method, entry point of the program
    {
LinkedList list=new LinkedList();
		
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(23);
		list.add('A');
		list.add("String");
		list.add("Padmaja");
		list.add(2.3);
		list.add(true);
		list.addFirst(10);
		System.out.println(list);
		
		
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(2);
		list2.add(7);
		list2.add(10);
		list2.add(7);
		list2.add(10);
		list2.add(7);
		list2.add(10);
		//list2.add("Padmaja");
		list.remove(10);
		list.remove(3);
		list.get(5);
		list.getFirst();
		list.getLast();
		
		System.out.println(list2);
		// fetch the recorf using iterator and list iterator from a LinkedList;
		
		//Iterator iterator
		
	}

}
