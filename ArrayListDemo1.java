package com.demo;

import java.util.ArrayList;
import java.util.LinkedList;
//abstract class =can not instantiate(u can not create the object of abstarct class and interface)
//interface 
import java.util.List;
import java.util.RandomAccess;
//Array is is internally using array data structure to organized the data	
//it is maintaing the insertion order
//modification(Insertion and deletion) of the data in array list is time consuming 	
//Duplicates are allowed in array list
//multiple null are allowed in array list
//	retrival of data in array list is possible.

public class ArrayListDemo1 {

	public static void main(String[] args) {
		//Interfaces->	List  Queue   Set
		
		/*	5  Padmaja  A  true  7  E     2.3f
			0     1     2   3    4  5     6  */
			
			
			ArrayList list=new ArrayList();
			list.add(5);
			
			list.add('A');
			list.add("Padmaja");
			list.add("Padmaja");
			list.add(true);
			list.add(0);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add('E');
			list.add(2.3f);
			list.add(true);
			list.add(7);
			list.add('E');
			list.add(2.3f);
			
		/*	one  two three four five 
			0     1   2     3    4     */
			
			ArrayList<String> list2=new ArrayList<String>();
			list2.add("One");  //0 index
			list2.add("Two");
			list2.add("Three");// 2 index
			
			System.out.println(list2.size()); // output 3
			
			list2.add("Four"); // 3 index
			list2.add("Five");  // 4 index
			
			System.out.println(list2.size()); //output 5
			
			list2.remove("Two"); 
			
			System.out.println(list2.size()); // output 4
			
			list2.add(1, "Two"); //index 1
			
			
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		//System.out.println(list.get(5));
		System.out.println(list2);
		
	/*class -extends-  class	
	interafce - implemets   - class
	interface -  extends    -interface
	class -   not possible          - interface
		
		 Object   - class 
		
		iterator  -interafce
		
		Collection 
		
		
	List   Queue   Set	

	ArrayList  */
		/*implents Iterable<E>
		
		implenets Collection
		
		extends AbstractCollection implements List
		
		extends AbstractList  implemenst List<E>, RandomAccess, Cloneable, java.io.Serializable
		
		
		ArrayList*/
		
		
		

		}

	}
