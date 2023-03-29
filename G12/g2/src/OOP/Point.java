package OOP;

public class Point {
	private int x, y;	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Point(){
		x = 0; y = 0;
	}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Point(Point p) {
		this.x =p.x;
		this.y = p.y;
	}
	public double Distance() {
		double d = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
		return d;
	}
	public double Distance(Point q) {
		double d = Math.sqrt(Math.pow(x-q.x,2) + Math.pow(y-q.x, 2));
		return d;
	}
	public static double Distance(Point p,Point q ) {
//		double d = Math.sqrt(Math.pow(p.x-q.x,2) + Math.pow(p.y-q.x, 2));
		return p.Distance(q);
	}
	@Override
	public String toString() {
		return super.toString();
	}	
}