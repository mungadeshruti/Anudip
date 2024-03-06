package com.demo;

public class MonthEnumExample {
	enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE
        
    }

    public static void main(String[] args) {
        // Iterate through each month in the enumeration
        for (Month month : Month.values()) {
            System.out.println("JANUARY");
            System.out.println("FEBRUARY");
            System.out.println("MARCH");
            System.out.println("APRIL");
            System.out.println("MAY");
            System.out.println("JUNE");
          
        }
    }
}

