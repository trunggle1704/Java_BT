package Extends;

public class Shape {
	private String color;
	private boolean filled;
	public Shape() {
		color = "red";
		filled = true;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Shape[%s]",super.toString());
	}
}
