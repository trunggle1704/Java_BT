package Extends;

public class Square extends Rectangle{
	public Square() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Square (double side) {
		super(side,side);
		
	}
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
}
