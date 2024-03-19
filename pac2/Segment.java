package pac2;

import pac1.Point; // Option with import

public class Segment {

//	private pac1.Point origin, end; // Option without import
    private Point origin, end;  // Option with import
	
	public Segment(double x1, double y1, double x2, double y2) {
		origin = new Point(x1, y1);
		end = new Point(x2, y2);
	}
	
	// Rest of methods
	
	public double length() {
		return origin.distance(end);
	}
}