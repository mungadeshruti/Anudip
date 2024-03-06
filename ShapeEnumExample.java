package com.demo;

public class ShapeEnumExample {
	 enum Shape {
	        CIRCLE,
	        TRIANGLE,
	        RECTANGLE
	    }

	    public static void main(String[] args) {
	        // Iterate through each shape in the enumeration
	        for (Shape shape : Shape.values()) {
	            switch (shape) {
	                case CIRCLE:
	                    System.out.println("This is a circle.");
	                    break;
	                case TRIANGLE:
	                    System.out.println("This is a triangle.");
	                    break;
	                case RECTANGLE:
	                    System.out.println("This is a rectangle.");
	                    break;
	                default:
	                    System.out.println("Unknown shape.");
	            }
	        }
	    }
	}

