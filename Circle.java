package com.interfacedemo;

public class Circle implements Shape {
	
	private double radius;
	
	public Circle(double redius) {
		super();
		this.radius = radius;
	}
	@override
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
