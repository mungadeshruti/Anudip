package com.demo;

import java.util.LinkedList;

public class LinkListHierarchyMain extends LinkedList<String>{

	public static void main(String[] args) {
		LinkListHierarchyMain myList = new 	LinkListHierarchyMain();
		
		myList.add("Java Fruit");
		myList.add("Star Fruit");
		myList.add("Mango");
		
		System.out.println(myList);
		
		myList.add("Apple");
		myList.add("Banana");
		
		System.out.println(myList);
	}

}
