package Extends;

public class Rectangle extends Shape {
	private double width,length;
	public Rectangle() {
		super();
		width = length = 1;
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public double getArrea() {
		return width * length;
	}
	public double getPerimeter() {
		return 2 * (width + length);
	}
	@Override
	public String toString() {
		return String.format("Rectangle[%s, width=%f, length=%f]", super.toString(), width,length);
	}
	
}
