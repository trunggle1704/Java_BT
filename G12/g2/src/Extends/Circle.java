package Extends;

public class Circle extends Shape {
	private double radius;
	public Circle() {
		super();
		radius = 1;
	}
	public Circle(double radius) {
		super()
		this.radius = radius;
	}
	public Circle(double radius, String color. boolean filled) {
		super(color,filled);
		this.radius = radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Circle[%s,radius=%f]",super.toString(),radius);
	}
}
