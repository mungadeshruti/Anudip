package com.demo;

public class DaysEnumExample {
	  enum Day {
	        SUNDAY,
	        MONDAY,
	        TUESDAY,
	        WEDNESDAY,
	        THURSDAY,
	        FRIDAY,
	        SATURDAY
	    }

	    public static void main(String[] args) {
	       
	    	for (Day day : Day.values()) {
	            System.out.println("SUNDAY");
	            System.out.println("MONDAY");
	            System.out.println("TUESDAY");
	            System.out.println("WEDNESDAY");
	            System.out.println("THURSDAY");
	            System.out.println("FRIDAY");
	            System.out.println("SATURDAY");
				
	        
	    	}
	    }
}
