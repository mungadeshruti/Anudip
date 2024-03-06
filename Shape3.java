package inheritancedemo;

public class Shape3 {
public void draw() {
	System.out.println("Drawing generic shape");
}
public double calculateArea() {
	return 0;
}
}
class Circle1 extends Shape3{
	private double radius;
	public Circle1 (double radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
class Cylinder extends Circle {
	private double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public void draw() {
		System.out.println("Drawing Cylinder");
	}
	public double calculateArea(int radius) {
		return (2 * Math.PI * radius * height) + (2 * super.calculateArea());
		
	}
}
public class Shape4{
	

	public static void main(String[] args) {
	Circle1 circle1 = new Circle1(4);	
	Cylinder  cylinder= new Cylinder(4,8);	
	
	circle1.draw();
	System.out.println("Area of Circle:" + circle1.calculateArea());
	
	cylinder.draw();
	System.out.println("Total Surface Area of Cylinder:" + cylinder.calculateArea());

	}
}

