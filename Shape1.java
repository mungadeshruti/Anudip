package inheritancedemo;
import java.lang.Math;
public class Shape1 {

	void draw() {
	}
    double calculateArea() {
		return 0;
	}
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
    	
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Cylinder
class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing Cylinder");
    }

    @Override
    double calculateArea() {
        // Total surface area of a cylinder = 2πr(r + h) + 2πr^2
        return 2 * Math.PI * radius * (radius + height) + 2 * super.calculateArea();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of Circle and Cylinder
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(3, 7);

        // Drawing each shape
        circle.draw();
        cylinder.draw();

        // Calculating and printing area of each shape
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Surface area of Cylinder: " + cylinder.calculateArea());
    }
}
