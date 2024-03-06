package com.demo;
enum Shape{
	Circle,
	Rectangle,
	Triangle
}
enum Days{
	Monday,
	Tuesday
}
enum Month{
	Jan,
	Feb
	
}
enum Direction
{
	North,
	South,
	East,
	West
}


public class EnumerationDemo {

	public static void main(String[] args) {
		
		Direction di1=Direction.North;
		Direction di2=Direction.South;
		Direction di3=Direction.East;
		Direction di4=Direction.West;
		
		System.out.println("First direction: "+ di1);
		System.out.println("Second direction: "+ di2);
		System.out.println("Third direction: "+ di3);
		System.out.println("Forth direction: "+ di4);
		
		
		
	}

}
