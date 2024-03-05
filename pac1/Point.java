package pac1;

public class Point {

	private double x, y;

	public Point(double a, double b) {
		x = a; y = b;
	}

	public void translate(double a, double b) {
		x += a; y += b;
	}

	public double distance(Point p) { 
		return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));

	}
}