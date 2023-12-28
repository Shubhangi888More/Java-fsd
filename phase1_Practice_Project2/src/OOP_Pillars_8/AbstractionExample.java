package OOP_Pillars_8;

abstract class Shape {
	// Abstract method (no implementation)
	abstract double calculateArea();

	// Concrete method
	void display() {
		System.out.println("This is a shape.");
	}
}

// Concrete class implementing the abstract class
class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	// Implementing the abstract method
	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}
}

// Concrete class implementing the abstract class
class Rectangle extends Shape {
	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// Implementing the abstract method
	@Override
	double calculateArea() {
		return length * width;
	}
}

public class AbstractionExample {
	public static void main(String[] args) {
		// Creating objects of concrete classes
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(4, 6);

		// Calling abstract and concrete methods
		circle.display();
		System.out.println("Area of Circle: " + circle.calculateArea());

		rectangle.display();
		System.out.println("Area of Rectangle: " + rectangle.calculateArea());
	}
}
