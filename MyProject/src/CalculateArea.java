import java.util.ArrayList;

class Shape {
	public void displayArea() {
		System.out.println("Calculating area...");
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void calculateArea() {
		double area = length * width;
		System.out.println("Rectangle Area: " + area);
	}
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		double area = Math.PI * radius * radius;
		System.out.println("Circle Area: " + area);
	}
}

public class CalculateArea {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();

		shapes.add(new Rectangle(5, 3));
		shapes.add(new Circle(2.5));

		try {
			for (Shape shape : shapes) {
				shape.displayArea();
				if (shape instanceof Rectangle) {
					Rectangle rectangle = (Rectangle) shape;
					rectangle.calculateArea();
				} else if (shape instanceof Circle) {
					Circle circle = (Circle) shape;
					circle.calculateArea();
				}
			}
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		} finally {
			System.out.println("Calculation completed.");
		}
	}
}